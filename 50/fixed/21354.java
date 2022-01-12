public void setImage(final org.eclipse.emf.henshin.model.Node image) {
    this.image = image;
    if (image != null) {
        imageLayout = HenshinLayoutUtil.INSTANCE.getLayout(image);
        imgGraph = image.getGraph();
    }
}