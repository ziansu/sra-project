private void addAlternate(java.util.List<org.verapdf.model.pdlayer.PDXImage> alternates, org.verapdf.model.impl.pb.pd.images.COSDictionary buffer, org.apache.pdfbox.pdmodel.PDResources resources) {
    org.verapdf.model.impl.pb.pd.images.COSBase alternatesImages = buffer.getDictionaryObject(COSName.IMAGE);
    if (alternatesImages instanceof org.verapdf.model.impl.pb.pd.images.COSStream) {
        final org.apache.pdfbox.pdmodel.common.PDStream stream = new org.apache.pdfbox.pdmodel.common.PDStream(((org.verapdf.model.impl.pb.pd.images.COSStream) (alternatesImages)));
        org.apache.pdfbox.pdmodel.graphics.image.PDImageXObjectProxy imageXObject = new org.apache.pdfbox.pdmodel.graphics.image.PDImageXObjectProxy(stream, resources, null);
        alternates.add(new org.verapdf.model.impl.pb.pd.images.PBoxPDXImage(imageXObject, this.document, this.flavour));
    }
}