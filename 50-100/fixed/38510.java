public int execute() {
    for (int i = 0; i < (N); i++) {
        executeUtil(instructions[i][0], instructions[i][1], instructions[i][2]);
    }
    int output = calculateVolume();
    java.lang.System.out.println(output);
    return output;
}