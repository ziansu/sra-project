public java.util.ArrayList<java.lang.String> run() {
    java.lang.System.out.println(("commandObj index = " + (commandObj.getIndex())));
    java.lang.System.out.println();
    setSearchInformation();
    printSearchInformation();
    processSearch();
    setOutput();
    return output;
}