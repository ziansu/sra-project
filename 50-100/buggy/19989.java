public static varcode.java.code._fields cloneOf(varcode.java.code._fields prototype) {
    varcode.java.code._fields fs = new varcode.java.code._fields();
    for (int i = 0; i < (prototype.fields.size()); i++) {
        fs.addFields(varcode.java.code._fields._field.from(prototype.fields.get(i)));
    }
    return fs;
}