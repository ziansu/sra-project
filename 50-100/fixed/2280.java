private static javafx.scene.paint.Material createMaterial(javafx.scene.paint.Color dif, javafx.scene.paint.Color spec) {
    javafx.scene.paint.PhongMaterial mat = new javafx.scene.paint.PhongMaterial();
    mat.setDiffuseColor(new javafx.scene.paint.Color(dif.getRed(), dif.getGreen(), dif.getBlue(), 1.0));
    mat.setSpecularColor(spec);
    mat.setDiffuseMap(picktest.PickTest3D.diffuseMap);
    return mat;
}