@java.lang.Override
public void setVertexBuffer() {
    if (vertices.isEmpty())
        return ;
    
    com.jme3.math.Vector3f[] arrvertices = new com.jme3.math.Vector3f[vertices.size()];
    vertices.toArray(arrvertices);
    setBuffer(Type.Position, 3, com.jme3.util.BufferUtils.createFloatBuffer(arrvertices));
}