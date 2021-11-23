private java.lang.String readLine(com.jantuomi.tunkki.repl.ConsoleReader reader, java.lang.String promptMessage) throws java.io.IOException {
    java.lang.System.out.print(promptMessage);
    java.lang.String line = reader.readLine();
    return line.trim();
}