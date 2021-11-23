@java.lang.Override
public org.markdownwriterfx.editor.EmbeddedImage setStyle(org.markdownwriterfx.editor.EmbeddedImage seg, java.util.Collection<java.lang.String> style) {
    return seg == (emptySeg) ? emptySeg : new org.markdownwriterfx.editor.EmbeddedImage(seg.text, style);
}