private static void saveComponents(java.lang.String path) {
    try {
        main.Window.fos = new java.io.FileOutputStream(path);
        main.Window.oos = new java.io.ObjectOutputStream(main.Window.fos);
        main.Window.oos.writeObject(main.Window.addedComponents);
        main.Window.fos.close();
        main.Window.oos.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    main.Window.mntmSave.setEnabled(true);
    java.lang.System.out.println(("Saved To File: " + (main.Window.saveName)));
}