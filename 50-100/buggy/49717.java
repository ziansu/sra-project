public org.jtext.ui.graphics.Rectangle apply(final org.jtext.ui.graphics.Dimension area) {
    return org.jtext.ui.graphics.Rectangle.of(left, top, (((area.width) - (left)) - (right)), (((area.height) - (top)) - (bottom)));
}