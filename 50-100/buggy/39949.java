private void findAndPrint() {
    int number = readIntegerFromInput("Please enter an integer to find:");
    java.lang.String numberIndex = arrayHolder.findNumberIndex(number);
    if ((numberIndex.length()) > 0) {
        java.lang.String indexMsg = "Index";
        if ((numberIndex.length()) > 2)
            indexMsg = "Indexes";
        
        java.lang.System.out.printf("%s of a number %d is: %s\n", indexMsg, number, numberIndex);
    }else {
        java.lang.System.out.println("Number not found");
    }
}