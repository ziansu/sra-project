public java.util.ArrayList<java.lang.String> read() {
    java.util.ArrayList<java.lang.String> contents = new java.util.ArrayList<java.lang.String>();
    try {
        java.io.BufferedReader in = new java.io.BufferedReader(new java.io.FileReader(new java.io.File(path)));
        while (in.ready()) {
            contents.add(in.readLine());
        } 
        in.close();
        return contents;
    } catch (java.io.IOException e) {
        java.lang.System.out.println(("File could not be read: " + e));
    }
    return null;
}