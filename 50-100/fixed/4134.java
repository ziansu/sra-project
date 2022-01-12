public void put(int[] d, int offset, int length) {
    java.nio.IntBuffer iBuffer = ((java.nio.IntBuffer) (data));
    updates.add(new com.jme3.scene.PartialUpdatedVertexBuffer.Update(iBuffer.position(), length));
    iBuffer.put(d, offset, length);
}