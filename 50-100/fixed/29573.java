protected void enter(java.lang.String thing) {
    org.primordion.xholon.base.IXholon node = null;
    if (thing == null) {
        node = contextNode.getFirstChild();
    }else {
        node = findNode(thing, contextNode);
    }
    if ((node != null) && (node != (this))) {
        if (isContainerOrSupporter(node)) {
            moveto(node, "Entered");
        }
    }else {
        sb.append("Can't enter ").append(thing);
    }
}