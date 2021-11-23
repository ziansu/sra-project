public boolean applyAll(java.lang.String className, org.objectweb.asm.tree.ClassNode node) {
    boolean result = false;
    for (com.blazeloader.util.transformers.transformations.Transformation trans : getClassMap(className)) {
        result |= trans.apply(node);
    }
    return result;
}