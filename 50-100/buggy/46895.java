static java.lang.String readFile(java.lang.String n) {
    try {
        java.lang.String ret = "";
        java.util.Scanner fScan = new java.util.Scanner(new java.io.File(n));
        while (fScan.hasNextLine())
            ret += fScan.nextLine();
        
        return ret;
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return ("Error: File '" + n) + "' not found";
    }
}