public static void close() {
    try {
        if (HouseFile.inputFileOpen)
            HouseFile.inputFile.close();
        
        if (HouseFile.outputFileOpen)
            HouseFile.outputFile.close();
        
        HouseFile.inputFileOpen = false;
        HouseFile.outputFileOpen = false;
    } catch (java.io.IOException e) {
        java.lang.System.out.println(("Error " + e));
    }
}