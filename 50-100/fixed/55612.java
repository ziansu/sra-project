private java.util.List<hillbillies.model.Material> getMaterialsAt(hillbillies.model.Cube cube) {
    java.util.List<hillbillies.model.Material> foundMaterials = new java.util.ArrayList<>();
    for (hillbillies.model.Material material : materials) {
        if (material.getPosition().getEnclosingCube(this).equals(cube)) {
            foundMaterials.add(material);
        }
    }
    return foundMaterials;
}