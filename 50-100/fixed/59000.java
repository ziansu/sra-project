public static Tuple addImageToTuple(Tuple tuple, Image image) throws java.lang.Exception {
    org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject pdIMage = org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.createFromFileByContent(image.getFile(), tuple.getDocument());
    org.apache.pdfbox.pdmodel.PDPageContentStream contentStream = new org.apache.pdfbox.pdmodel.PDPageContentStream(tuple.getDocument(), tuple.getPage(), true, true);
    contentStream.drawImage(pdIMage, image.getXCood(), image.getYCood(), image.getWidth(), image.getHeight());
    contentStream.close();
    return tuple;
}