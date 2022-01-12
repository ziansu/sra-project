private java.lang.String[] extractTypeAndContentStrings(java.lang.String line) {
    java.lang.String[] typeAndValueStringsArray = line.split(":", 2);
    if ((typeAndValueStringsArray.length) == 2) {
        typeAndValueStringsArray[1] = typeAndValueStringsArray[1].trim();
        return typeAndValueStringsArray;
    }else {
        java.lang.System.out.println("There is an error in the configuration file in one of the uncommented lines.");
        return new java.lang.String[]{ "none" , "none" };
    }
}