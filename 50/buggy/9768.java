public void enableTexCoordPointer() {
    enableVertexPointer(texCoordID);
    glUniform1i(enableTextureID, 1);
}