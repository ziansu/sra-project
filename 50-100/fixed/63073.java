protected boolean doTransparent(com.akjava.gwt.skeltalboneanimation.client.TextureData textureData, final com.akjava.gwt.skeltalboneanimation.client.page.clippage.ClipData original) {
    if (original.isEmpty()) {
        return false;
    }
    com.akjava.gwt.skeltalboneanimation.client.page.clippage.ClipData clipData = original.copy(true);
    com.akjava.gwt.skeltalboneanimation.client.page.clippage.ClipImagePage.TransparentData data = new com.akjava.gwt.skeltalboneanimation.client.page.clippage.ClipImagePage.ClipDataToTransparentDataFunction(textureData).apply(clipData);
    transparentItPage.removeItemById(clipData.getId());
    transparentItPage.addItem(new com.google.common.base.Supplier<java.lang.String>() {
        @java.lang.Override
        public java.lang.String get() {
            return original.getId();
        }
    }, data.imageDrawingData, data.imageSrc, data.pointShape);
    return true;
}