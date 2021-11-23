@java.lang.Override
public org.markdownwriterfx.editor.EmbeddedImage subSequence(org.markdownwriterfx.editor.EmbeddedImage seg, int start) {
    return seg == (emptySeg) ? emptySeg : new org.markdownwriterfx.editor.EmbeddedImage(seg.node, seg.text.substring(start), seg.style);
}