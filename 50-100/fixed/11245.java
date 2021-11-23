public void setUniformMatrix(int loc, boolean transposed, org.joml.Matrix4f mat) {
    if (loc == (-1))
        return ;
    
    if ((example.ShaderProgram.buf16Pool) == null)
        example.ShaderProgram.buf16Pool = org.lwjgl.BufferUtils.createFloatBuffer(16);
    
    example.ShaderProgram.buf16Pool.clear();
    mat.get(example.ShaderProgram.buf16Pool);
    glUniformMatrix4fv(loc, transposed, example.ShaderProgram.buf16Pool);
}