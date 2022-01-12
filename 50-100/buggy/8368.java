public java.util.ArrayList<csv.Person> readCsv(java.io.InputStream is) throws java.io.IOException {
    java.io.BufferedInputStream bis = new java.io.BufferedInputStream(is);
    java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(bis));
    try {
        java.lang.String line;
        while ((line = reader.readLine()) != null) {
            parsedPersons.add(csv.Person.toPerson(line));
        } 
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e.getMessage());
    }
    return parsedPersons;
}