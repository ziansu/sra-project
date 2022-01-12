public void resizeComponents() {
    java.awt.Component temp;
    for (int i = 0; i < (content.getComponentCount()); i++) {
        if ((temp = content.getComponent(i)).isValid()) {
            if (rcs[i].responsive)
                resizeComponent(i, temp);
            else
                resizeFixedComponent(i, temp);
            
        }
    }
}