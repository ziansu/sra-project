public void write() {
    try {
        this.writer = new java.io.PrintWriter(new java.io.FileWriter(fileName, false));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    for (int i = 0; i < (todos.size()); i++) {
        writer.println(todos.get(i));
    }
    writer.flush();
    java.lang.System.out.printf("Wrote to %s.\n", this.fileName);
}