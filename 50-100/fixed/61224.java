private void readFile() throws java.lang.Exception {
    java.lang.String command = reader.readLine();
    while (command != null) {
        LogCommand(command.split(" "));
        executerTransaction(command.split(" "));
        command = reader.readLine();
    } 
}