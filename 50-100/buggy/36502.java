public final void setScroller(javax.swing.JScrollPane scrollPane) {
    if ((scroller) != scrollPane) {
        scroller = scrollPane;
        if ((scroller) != null) {
            scroller.getViewport().setView(this);
            scroller.addComponentListener(new java.awt.event.ComponentAdapter() {
                @java.lang.Override
                public void componentResized(java.awt.event.ComponentEvent e) {
                    scroller.getViewport().setViewSize(getSize());
                    scroller.invalidate();
                    scroller.validate();
                    doLayout();
                }
            });
        }
    }
}