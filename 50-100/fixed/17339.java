public void makeComponentsWhiteBG(java.awt.Container c) {
    java.awt.Component[] m = c.getComponents();
    for (int i = 0; i < (m.length); i++) {
        m[i].setBackground(java.awt.Color.WHITE);
        if (c.getClass().isInstance(m[i]));
        makeComponentsWhiteBG(((java.awt.Container) (m[i])));
    }
}