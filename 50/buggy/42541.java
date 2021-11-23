private void focusThumb(rosa.pageturner.client.model.Page focusPage) {
    int index = model.getPagePosition(focusPage.id);
    if (index >= 0) {
        thumbnailStrip.focusImage(index);
    }
}