private java.util.List<hillbillies.model.Material> getMaterialsAt(hillbillies.model.Cube cube) {
    java.util.List<hillbillies.model.Material> foundMaterials = new java.util.ArrayList<>();
    for (hillbillies.model.Material material : materials) {
        if (hillbillies.model.Vector.equals(material.getPosition().getEnclosingCube(), cube)) {
            foundMaterials.add(material);
        }
    }
    return foundMaterials;
}