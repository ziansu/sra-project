public void writeCountries(java.lang.String userCountry) {
    try (java.io.PrintWriter out = new java.io.PrintWriter(new java.io.BufferedWriter(new java.io.FileWriter(aNewFile, true)))) {
        out.print(userCountry);
        out.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}