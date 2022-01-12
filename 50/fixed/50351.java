private void printInputParameter() {
    java.lang.String output = "";
    for (int index : indexesOfInputStringAsCharArray) {
        output += inputCharArray[index];
    }
    java.lang.System.out.println(output);
}