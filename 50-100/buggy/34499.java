public boolean inherits(AbstractSymbol sub, AbstractSymbol base) {
    class_c current = getClass(sub);
    while (!(current.getName().equals(base))) {
        if (current.getName().equals(TreeConstants.Object_)) {
            return false;
        }
        current = getClass(current.getParent());
    } 
    return true;
}