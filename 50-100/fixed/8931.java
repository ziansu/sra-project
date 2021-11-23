protected org.eclipse.xtext.common.types.JvmType doFindTypeByName(java.lang.String name, boolean traverseNestedTypes) {
    java.lang.String signature = getSignature(name);
    if (signature == null)
        return null;
    
    org.eclipse.emf.common.util.URI resourceURI = typeUriHelper.createResourceURI(signature);
    if ((resourceURI.segment(0)) == (org.eclipse.xtext.common.types.access.jdt.JdtTypeProvider.PRIMITIVES)) {
        return findPrimitiveType(signature, resourceURI);
    }else {
        return findObjectType(signature, resourceURI, traverseNestedTypes);
    }
}