public void sendVboData() {
    verticesVbo.sendDataAutoBind();
    colorsVbo.sendDataAutoBind();
    if (indexed) {
        indicesVbo.sendDataAutoBind();
    }else {
        normalsVbo.sendDataAutoBind();
    }
}