private void readData() {
    try {
        java.io.FileInputStream fis = openFileInput(com.example.gary.simon.Title.DATA_FILENAME);
        java.util.Scanner scanner = new java.util.Scanner(fis);
        if (scanner.hasNext()) {
            int i;
            top_Score = scanner.nextInt();
        }
        scanner.close();
    } catch (java.io.FileNotFoundException e) {
    }
}