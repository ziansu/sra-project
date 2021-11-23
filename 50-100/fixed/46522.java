private javax.swing.JScrollPane getScroll(java.awt.Component view, int x, int y, int w, int h) {
    javax.swing.JScrollPane jScroll = new javax.swing.JScrollPane(view);
    jScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    jScroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
    jScroll.setBounds(x, y, w, h);
    return jScroll;
}