public static ch.njol.skript.config.Node[] getSection() {
    ch.njol.skript.config.SectionNode sectionNode = ((ch.njol.skript.config.SectionNode) (ch.njol.skript.log.SkriptLogger.getNode()));
    ch.njol.skript.config.Node[] nodes = new ch.njol.skript.config.Node[sectionNode.size()];
    int i = 0;
    for (ch.njol.skript.config.Node node : sectionNode) {
        nodes[i] = node;
        sectionNode.remove(node);
        i++;
    }
    return nodes;
}