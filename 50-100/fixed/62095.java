public void translate(float x, float y, float z) {
    transform.translate(x, y, z);
    if ((childs) != null) {
        for (com.mbrlabs.mundus.scene3d.GameObject node : this.childs) {
            node.translate(x, y, z);
        }
    }
}