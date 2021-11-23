@org.jetbrains.annotations.NotNull
private java.lang.String getTypeOfHEAD() throws MyExceptions.WrongFormatException, java.io.IOException {
    java.util.List<java.lang.String> lines = java.nio.file.Files.readAllLines(realHEAD);
    if ((lines.size()) != 1) {
        throw new ru.spbau.MyExceptions.WrongFormatException();
    }
    java.lang.String[] stringList = lines.get(0).split(" ");
    if ((stringList.length) != 2) {
        java.lang.System.out.println(lines.get(0));
        throw new ru.spbau.MyExceptions.WrongFormatException();
    }
    return stringList[0];
}