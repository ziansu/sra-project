protected java.lang.String getPackageName() {
    return this.elements.getPackageOf(this.annotatedElement).getQualifiedName().toString();
}