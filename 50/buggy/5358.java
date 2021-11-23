@java.lang.Override
public java.lang.String toModelImport(java.lang.String name) {
    if ("".equals(modelPackage())) {
        return name;
    }else {
        return ((modelPackage()) + ".") + name;
    }
}