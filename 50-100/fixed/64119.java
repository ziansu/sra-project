@java.lang.Override
public org.wilson.world.menu.MenuItem getMenuItem() {
    org.wilson.world.model.Context currentContext = org.wilson.world.manager.ContextManager.getInstance().getCurrentContext();
    java.lang.String userHint = "User";
    java.lang.String userColor = null;
    if (currentContext != null) {
        userHint = currentContext.name;
        userColor = currentContext.color;
    }
    org.wilson.world.menu.MenuItem item = new org.wilson.world.menu.MenuItem();
    item.id = "user_context";
    item.label = userHint;
    item.role = MenuItemRole.MenuGroup;
    if (userColor != null) {
        item.style = "color: " + userColor;
    }
    return item;
}