public static void reset() {
    try {
        if (HouseFile.inputFileOpen)
            HouseFile.inputFile.close();
        
        if (HouseFile.outputFileOpen)
            HouseFile.outputFile.close();
        
        HouseFile.inputFile = new BufferedReader(new FileReader("houses.dat"));
        HouseFile.inputFileOpen = true;
        HouseFile.inputString = HouseFile.inputFile.readLine();
    } catch (IOException e) {
        java.lang.System.out.println(("Error " + e));
    }
}