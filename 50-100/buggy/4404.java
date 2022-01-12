public void save(Automaton automaton, java.lang.String url) {
    try {
        java.io.FileOutputStream file = new java.io.FileOutputStream((url + ".aut"));
        java.io.ObjectOutputStream object = new java.io.ObjectOutputStream(file);
        object.writeObject(automaton);
        object.close();
        java.lang.System.out.println("saved!");
    } catch (java.lang.Exception e) {
        java.lang.System.out.println("error saving...");
    }
}