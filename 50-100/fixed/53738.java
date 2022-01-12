elaborator.MethodType getMethodType(java.lang.String className, java.lang.String mid) {
    elaborator.ClassBinding cb = this.table.get(className);
    elaborator.MethodType type = cb.methods.get(mid);
    while (type == null) {
        if ((cb.extendss) == null) {
            return type;
        }else {
            cb = this.table.get(cb.extendss);
            type = cb.methods.get(mid);
        }
    } 
    return type;
}