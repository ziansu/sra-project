private myessentials.Localization getLocal() {
    myessentials.command.CommandTreeNode node = this;
    while ((node.getParent()) != null) {
        MyEssentialsCore.instance.LOG.info(("Node is " + (node.getAnnotation().permission())));
        node = node.getParent();
    } 
    return myessentials.command.CommandManagerNew.getTree(node.getAnnotation().permission()).getLocal();
}