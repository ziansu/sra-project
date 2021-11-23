@java.lang.Override
public java.lang.String getQualifiedName() {
    if ((this.moduleName) == null) {
        return this.name;
    }
    return ((this.moduleName) + '.') + (this.name);
}