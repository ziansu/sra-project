public static void load(java.lang.String path) {
    utils.Log.print(utils.ModelImporter.class, (("Start importing " + path) + " ..."));
    java.io.File file = new java.io.File(path);
    com.interactivemesh.jfx.importer.obj.ObjModelImporter importer = new com.interactivemesh.jfx.importer.obj.ObjModelImporter();
    javafx.scene.shape.MeshView[] meshes = importer.getImport();
    utils.Log.print(utils.ModelImporter.class, "... done!");
}