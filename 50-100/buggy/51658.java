private void relocateFaces(java.util.ArrayList<manga.detect.Face> resizedFaces) {
    if ((resizedFaces.size()) > 0) {
        for (manga.detect.Face resizedFace : resizedFaces) {
            org.opencv.core.Rect currFaceBound = resizedFace.getBound();
            manga.detect.Face relocatedFace = new manga.detect.Face(resizedFace, ((currFaceBound.x) - (cropStartX)), ((currFaceBound.y) - (cropStartY)));
            relocatedFaces.add(relocatedFace);
        }
    }
}