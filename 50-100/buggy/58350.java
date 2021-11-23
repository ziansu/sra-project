public javafx.scene.control.MenuItem createMenuItem(org.praisenter.javafx.ApplicationAction action) {
    javafx.scene.control.MenuItem item = action.toMenuItem();
    item.setOnAction(( e) -> {
        this.node.fireEvent(new org.praisenter.javafx.ApplicationEvent(item, item, ApplicationEvent.ALL, action));
    });
    return item;
}