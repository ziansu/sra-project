private static java.io.File getDomainsDir() {
    java.io.File ret = new java.io.File(domainannotation.DomainAnnotationImpl.tempDir, "domains");
    if (!(ret.exists()))
        ret.mkdir();
    
    return ret;
}