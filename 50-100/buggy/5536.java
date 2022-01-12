public javafx.scene.shape.Mesh generateMesh() {
    javafx.scene.shape.TriangleMesh mesh = new javafx.scene.shape.TriangleMesh();
    mesh.getPoints().addAll(points.toArray());
    mesh.getTexCoords().addAll(texCoords.toArray());
    mesh.getFaces().addAll(faces.toArray());
    mesh.getFaceSmoothingGroups().addAll(faceSmoothingGroups.toArray());
    return mesh;
}