public Grafo open(java.lang.String fileName) {
    Grafo grafo;
    try {
        java.io.FileInputStream file = new java.io.FileInputStream((("saves/" + fileName) + ".grafo"));
        java.io.ObjectInputStream object = new java.io.ObjectInputStream(file);
        grafo = ((Grafo) (object.readObject()));
        object.close();
        java.lang.System.out.println("opened!");
        return grafo;
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("error opening...");
        return new Grafo();
    }
}