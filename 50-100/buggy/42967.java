@java.lang.Override
public java.util.Collection<com.github.singond.pdfriend.document.Content.Movable> getContent() {
    java.util.Set<com.github.singond.pdfriend.document.Content.Movable> contents = new java.util.HashSet<>();
    for (com.github.singond.pdfriend.book.model.MultiPage.Pagelet p : pagelets) {
        for (com.github.singond.pdfriend.document.Content.Movable cm : p.source.getMovableContent()) {
            cm.getTransform().preConcatenate(p.getPositionInPage());
            contents.add(cm);
        }
    }
    return contents;
}