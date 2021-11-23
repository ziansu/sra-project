public void put(int[] d, int offset, int length) {
    java.nio.IntBuffer iBuffer = ((java.nio.IntBuffer) (data));
    updates.add(new com.jme3.scene.PartialUpdatedVertexBuffer.Update(data.position(), (length * ((java.lang.Integer.SIZE) / 8))));
    iBuffer.put(d, offset, length);
}