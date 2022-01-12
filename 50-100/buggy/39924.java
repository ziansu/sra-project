private void initGroup() {
    final com.ait.lienzo.client.core.types.BoundingBox box = getPath().refresh().getBoundingBox();
    m_layout_container.setWidth(box.getWidth());
    m_layout_container.setHeight(box.getHeight());
    m_layout_container.getGroup().moveToTop();
}