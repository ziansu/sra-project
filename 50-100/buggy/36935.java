public void removeController(java.lang.Object controller) {
    if (controller == null)
        return ;
    
    removeControllerBinds(notifybinds, controller);
    removeControllerBinds(propertybinds, controller);
    removeControllerBinds(propertiesbinds, controller);
    removeControllerBinds(pathbinds, controller);
    removeControllerBinds(timelinenotifybinds, controller);
    org.springfield.fs.FsNode node = new org.springfield.fs.FsNode("bind", "1");
    node.setProperty("action", "remove controller");
    node.setProperty("controller", ("" + (controller.hashCode())));
    notify("/shared/internal", node);
}