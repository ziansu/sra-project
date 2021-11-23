private xyz.krachzack.gfx.mesh.Mesh meshFromObjPath(java.lang.String objFilePath) {
    com.zierfisch.util.ObjImporter importer = new com.zierfisch.util.ObjImporter();
    try {
        importer.load("assets/models/zierfisch.obj");
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException("Maker could not read OBJ file", e);
    }
    xyz.krachzack.gfx.mesh.MeshBuilder objBuilder = new xyz.krachzack.gfx.mesh.SegmentedMeshBuilder(xyz.krachzack.gfx.mesh.Primitive.TRIANGLES);
    return importer.make(objBuilder);
}