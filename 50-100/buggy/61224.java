private void readFile() throws java.lang.Exception {
    java.lang.String[] command = reader.readLine().split(" ");
    while (command != null) {
        LogCommand(command);
        executerTransaction(command);
        command = reader.readLine().split(" ");
    } 
}