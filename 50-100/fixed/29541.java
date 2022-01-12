public static void main(java.lang.String[] args) throws java.io.IOException, java.lang.InterruptedException {
    java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(new java.io.File("data.txt")));
    java.util.Set<java.lang.String> lines = new java.util.HashSet<>();
    while (reader.ready()) {
        lines.add(reader.readLine().substring(0, 3));
    } 
    java.lang.System.out.println("ready");
    java.lang.Thread.sleep(20000);
    reader.close();
}