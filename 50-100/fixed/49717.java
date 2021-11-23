public org.jtext.ui.graphics.Rectangle apply(final org.jtext.ui.graphics.Rectangle area) {
    return org.jtext.ui.graphics.Rectangle.of(((area.x) + (left)), ((area.y) + (top)), (((area.width) - (left)) - (right)), (((area.height) - (top)) - (bottom)));
}