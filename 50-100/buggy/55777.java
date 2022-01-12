public java.util.ArrayList<int[]> readCalibrationFile(java.lang.String filepathString) throws java.io.IOException {
    java.io.File filepath = new java.io.File(filepathString);
    try (java.util.Scanner scanner = new java.util.Scanner(filepath)) {
        while (scanner.hasNextLine()) {
            processLine(scanner.nextLine());
        } 
    }
    main.CalibrationData.CalibrationFileParser.sortData(calibrationData);
    return calibrationData;
}