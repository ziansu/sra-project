public void addTo(java.awt.Container layeredPane, int layer) {
    if (!((layeredPane.getLayout()) instanceof org.andork.awt.layout.DelegatingLayoutManager)) {
        layeredPane.setLayout(new org.andork.awt.layout.DelegatingLayoutManager());
    }
    layeredPane.add(this, delegate);
    if ((pinButtonDelegate) != null) {
        layeredPane.add(pinButton(), pinButtonDelegate);
    }
}