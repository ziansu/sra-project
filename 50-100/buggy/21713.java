public void write() {
    try {
        this.writer = new java.io.PrintWriter(new java.io.FileWriter(fileName, false));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    for (int i = todos.size(); i > 0; i--) {
        writer.println(todos.remove(0));
    }
    writer.flush();
    java.lang.System.out.printf("Wrote to %s.\n", this.fileName);
}