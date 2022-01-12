public static int getLabelIndex(org.objectweb.asm.tree.AbstractInsnNode ain) {
    if (me.lpk.util.OpUtils.labelCache.containsKey(ain)) {
        return me.lpk.util.OpUtils.labelCache.get(ain);
    }
    int index = 0;
    while ((ain.getPrevious()) != null) {
        ain = ain.getPrevious();
        if (ain instanceof org.objectweb.asm.tree.LabelNode) {
            index += 1;
        }
    } 
    me.lpk.util.OpUtils.labelCache.put(ain, index);
    return index;
}