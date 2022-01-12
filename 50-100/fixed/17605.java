public void printProgram(java.io.PrintStream out) {
    out.println("Running Program: ");
    int num = 0;
    for (java.lang.String[] command : list) {
        int index = java.lang.Integer.parseInt(command[1], 2);
        out.printf("%20s %s %3s %s\n", command[0], ": ", index, ((("Binery(" + (command[2])) + ")#") + num));
        num++;
    }
}