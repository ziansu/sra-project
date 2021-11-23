public void addCone(double height, double radius, us.ihmc.euclid.tuple3D.interfaces.Tuple3DBasics offset) {
    addMesh(us.ihmc.graphicsDescription.MeshDataGenerator.Cone(height, radius, us.ihmc.graphicsDescription.MeshDataBuilder.DEFAULT_RES), offset);
}