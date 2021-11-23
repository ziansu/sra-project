public void saveFile() {
    java.io.File dir = new java.io.File("save");
    java.io.PrintWriter writer = null;
    try {
        if (!(dir.exists())) {
            java.lang.System.out.println("hei");
            dir.mkdir();
        }
        writer = new java.io.PrintWriter("save/save.txt");
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    }
    for (Stream s : streamlist) {
        writer.println(s.toString());
    }
    writer.close();
}