@java.lang.Override
public boolean isLazy() {
    if ((isLazy) == null) {
        isLazy = java.lang.Boolean.valueOf(usesIndirection());
    }
    return isLazy.booleanValue();
}