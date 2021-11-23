public void saveParse() {
    java.lang.System.out.println("## Trace ##");
    java.lang.System.out.println(parse);
    try {
        java.io.BufferedWriter writer = new java.io.BufferedWriter(new java.io.FileWriter("parsefile.txt"));
        writer.write("## Trace File ##\n");
        writer.write(parse);
        writer.close();
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}