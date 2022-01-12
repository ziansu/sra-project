@java.lang.Override
public void setForeground(java.awt.Color color) {
    if ((foreground) == null) {
        super.setForeground(color);
        if ((module) != null)
            for (java.awt.Component c : getComponents()) {
                c.setForeground(color);
            }
        
    }
}