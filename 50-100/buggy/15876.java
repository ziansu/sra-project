protected void setIndexVBO(int[] indices) {
    if ((this.indexVBO) == null) {
        this.indexVBO = new com.jukusoft.rpg.graphic.opengl.buffer.IntegerVertexBufferObject(GL_ELEMENT_ARRAY_BUFFER);
    }
    this.indexVBO.bind();
    this.indexVBO.putData(indices);
    this.indexVBO.defineStructure(2, 3, false, 0, 0);
    this.indexVBO.unbind();
}