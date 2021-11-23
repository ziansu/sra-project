private void relocateFaces(java.util.ArrayList<manga.detect.Face> resizedFaces) {
    if ((resizedFaces.size()) > 0) {
        for (manga.detect.Face resizedFace : resizedFaces) {
            manga.detect.Face relocatedFace = new manga.detect.Face(resizedFace, cropStartX, cropStartY);
            relocatedFaces.add(relocatedFace);
        }
    }
}