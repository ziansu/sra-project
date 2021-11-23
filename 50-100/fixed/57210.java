public boolean containsThumbnail(int userPage, int page, float width, float height, android.graphics.RectF pageRelativeBounds) {
    com.github.barteksc.pdfviewer.model.PagePart fakePart = new com.github.barteksc.pdfviewer.model.PagePart(userPage, page, null, width, height, pageRelativeBounds, true, 0, 0, 0);
    synchronized(thumbnails) {
        for (com.github.barteksc.pdfviewer.model.PagePart part : thumbnails) {
            if (part.equals(fakePart)) {
                return true;
            }
        }
        return false;
    }
}