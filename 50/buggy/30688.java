public void disableTexCoordPointer() {
    disableVertexPointer(texCoordID);
    glUniform1i(enableTextureID, 0);
}