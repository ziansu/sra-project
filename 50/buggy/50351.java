private void printInputParameter() {
    java.lang.System.out.println();
    java.lang.String output = "";
    for (int index : indexesOfInputStringAsCharArray) {
        output += inputCharArray[index];
        java.lang.System.out.print(index);
    }
    java.lang.System.out.println(("\n" + output));
}