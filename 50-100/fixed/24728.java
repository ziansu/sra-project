@java.lang.SuppressWarnings(value = { "unchecked" })
private static void openComponents(java.lang.String path) {
    try {
        main.Window.fis = new java.io.FileInputStream(path);
        main.Window.ois = new java.io.ObjectInputStream(main.Window.fis);
        main.Window.addedComponents = ((java.util.ArrayList<main.Window.AddedComponent>) (main.Window.ois.readObject()));
        main.Window.fis.close();
        main.Window.ois.close();
    } catch (java.lang.ClassNotFoundException | java.io.IOException e) {
        e.printStackTrace();
    }
}