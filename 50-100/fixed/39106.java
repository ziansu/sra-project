public static int getLabelIndex(org.objectweb.asm.tree.AbstractInsnNode ain) {
    if (me.lpk.util.OpUtils.labelCache.containsKey(ain)) {
        return me.lpk.util.OpUtils.labelCache.get(ain);
    }
    int index = 0;
    org.objectweb.asm.tree.AbstractInsnNode node = ain;
    while ((node.getPrevious()) != null) {
        node = node.getPrevious();
        if (node instanceof org.objectweb.asm.tree.LabelNode) {
            index += 1;
        }
    } 
    me.lpk.util.OpUtils.labelCache.put(ain, index);
    return index;
}