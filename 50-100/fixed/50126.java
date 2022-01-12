public void drawGallery(int questionNumber, int part) {
    scale = 60;
    galleryNumber = questionNumber;
    galleryPoints = reader.getData(questionNumber, part);
    f.setTitle(((("Shots on Jaz - Part: " + part) + " Question: ") + questionNumber));
    setPolygon(galleryPoints);
    guardList.clear();
}