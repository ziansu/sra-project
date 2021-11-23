void impl_renderNodeToScreen(java.lang.Object implGraphics) {
    com.sun.prism.Graphics g = ((com.sun.prism.Graphics) (implGraphics));
    if ((node.getEffectFilter()) != null) {
        node.renderEffect(g);
    }else {
        node.renderContent(g);
    }
}