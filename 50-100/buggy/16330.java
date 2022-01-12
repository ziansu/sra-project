@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((this) == obj)
        return true;
    
    if (obj == null)
        return false;
    
    if ((getClass()) != (obj.getClass()))
        return false;
    
    org.yakindu.sct.model.stext.scoping.IPackageImport2URIMapper.PackageImport other = ((org.yakindu.sct.model.stext.scoping.IPackageImport2URIMapper.PackageImport) (obj));
    if (!(attributesEqual(other)))
        return false;
    
    return true;
}