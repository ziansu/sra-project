public java.io.InputStream openClassfile(java.lang.String classname) throws javassist.NotFoundException {
    java.lang.String filename = ('/' + (classname.replace('.', '/'))) + ".class";
    return thisClass.getResourceAsStream(('/' + filename));
}