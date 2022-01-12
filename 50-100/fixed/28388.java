public myessentials.Localization getLocal() {
    myessentials.command.CommandTreeNode node = this;
    while ((node.getParent()) != null) {
        node = node.getParent();
    } 
    return myessentials.command.CommandManagerNew.getTree(node.getAnnotation().permission()).getLocal();
}