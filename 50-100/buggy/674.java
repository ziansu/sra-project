protected final void updateImpl() throws java.io.IOException {
    java.lang.System.out.println("WRITER UPDATE");
    nl.ramondevaan.visualization.mesh.Mesh mesh = getInput(0);
    if (mesh == null) {
        throw new java.lang.UnsupportedOperationException("No mesh was provided");
    }
    if ((path) == null) {
        throw new java.lang.UnsupportedOperationException("No path was provided.");
    }
    file = new java.io.File(path);
    file.getParentFile().mkdirs();
    write(mesh);
    lastPath = path;
    pathChanged = false;
}