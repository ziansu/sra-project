public java.io.BufferedReader readFile() {
    try {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader("MembersInfo.txt"));
        return br;
    } catch (java.io.IOException error) {
        java.lang.System.out.println("Kunne ikke læse filen..");
        return null;
    }
}