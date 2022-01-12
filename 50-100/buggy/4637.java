public void init() {
    for (int i = 0; i < 6; i++) {
        java.lang.String imageText = null;
        imageText = getParameter(("image" + i));
        if (imageText != null) {
            (totalPictures)++;
            picture[i] = getImage(getCodeBase(), imageText);
        }else
            break;
        
    }
    java.lang.String pauseText = null;
    pauseText = getParameter("pause");
    if (pauseText != null) {
        pause = java.lang.Integer.parseInt(pauseText);
    }
}