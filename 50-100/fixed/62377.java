public java.lang.String jump() {
    java.lang.String currentCommand = commands.get(index);
    if (currentCommand.contains(";")) {
        int semi = currentCommand.indexOf(";");
        return currentCommand.substring((semi + 1));
    }else {
        return "";
    }
}