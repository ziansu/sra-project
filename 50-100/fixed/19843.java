public void render(int offset) {
    float range = state.range;
    if (range == 0) {
        for (org.vaadin.sonarwidget.widgetset.client.ui.ImageRenderer renderer : renderers) {
            if (renderer.isVisible(offset)) {
                if ((renderer.getMaxDepthArea()) > range) {
                    range = renderer.getMaxDepthArea();
                }
            }
        }
    }
    for (org.vaadin.sonarwidget.widgetset.client.ui.ImageRenderer renderer : renderers) {
        if (renderer.isVisible(offset)) {
            renderer.setRange(range);
            renderer.render();
        }
    }
}