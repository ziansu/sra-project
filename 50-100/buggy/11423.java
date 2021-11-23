public static boolean isCollection(final org.eclipse.ocl.pivot.PropertyCallExp e) {
    org.eclipse.ocl.pivot.Type _type = e.getType();
    final java.lang.String s = fr.emn.atlanmod.uml.casestudy.rewrite.OCL.gen(_type);
    if (((com.google.common.base.Objects.equal(s, "Set")) || (com.google.common.base.Objects.equal(s, "OrderedSet"))) || (com.google.common.base.Objects.equal(s, "Sequence"))) {
        return true;
    }else {
        return false;
    }
}