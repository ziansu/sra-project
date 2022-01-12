public static void dispalyTotal(boolean special) {
    try {
        java.io.FileReader fr = new java.io.FileReader("customerBill.txt");
        java.io.BufferedReader br = new java.io.BufferedReader(fr);
        java.lang.String line;
        while ((line = br.readLine()) != null) {
            java.lang.System.out.println(line);
        } 
        fr.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}