public void disableTexCoordPointer() {
    if ((texCoordID) != (-1))
        disableVertexPointer(texCoordID);
    
    glUniform1i(enableTextureID, 0);
}