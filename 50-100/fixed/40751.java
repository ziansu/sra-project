public static void reset() {
    try {
        if (HouseFile.inputFileOpen)
            HouseFile.inputFile.close();
        
        if (HouseFile.outputFileOpen)
            HouseFile.outputFile.close();
        
        HouseFile.inputFile = new java.io.BufferedReader(new java.io.FileReader("houses.dat"));
        HouseFile.inputFileOpen = true;
        HouseFile.inputString = HouseFile.inputFile.readLine();
    } catch (java.io.IOException e) {
        java.lang.System.out.println(("Error " + e));
    }
}