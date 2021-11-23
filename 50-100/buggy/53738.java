elaborator.MethodType getMethodType(java.lang.String className, java.lang.String mid) {
    if (className == null) {
        return null;
    }
    elaborator.ClassBinding cb = this.table.get(className);
    elaborator.MethodType type = cb.methods.get(mid);
    if ((cb.extendss) == null) {
        return type;
    }else {
        return getMethodType(cb.extendss, mid);
    }
}