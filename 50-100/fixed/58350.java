public javafx.scene.control.MenuItem createMenuItem(org.praisenter.javafx.ApplicationAction action, java.lang.String label) {
    javafx.scene.control.MenuItem item = ((label != null) && ((label.length()) > 0)) ? action.toMenuItem(label) : action.toMenuItem();
    item.setOnAction(( e) -> {
        this.node.fireEvent(new org.praisenter.javafx.ApplicationEvent(item, item, ApplicationEvent.ALL, action));
    });
    return item;
}