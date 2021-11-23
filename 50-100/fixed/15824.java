public void put(float[] d, int offset, int length) {
    java.nio.FloatBuffer fBuffer = ((java.nio.FloatBuffer) (data));
    updates.add(new com.jme3.scene.PartialUpdatedVertexBuffer.Update(fBuffer.position(), length));
    fBuffer.put(d, offset, length);
}