public boolean applyAll(java.lang.String className, org.objectweb.asm.tree.ClassNode node) {
    boolean result = true;
    for (com.blazeloader.util.transformers.transformations.Transformation trans : getClassMap(className)) {
        result |= trans.apply(node);
    }
    return result;
}