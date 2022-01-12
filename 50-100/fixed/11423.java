public static boolean isCollection(final org.eclipse.ocl.pivot.PropertyCallExp e) {
    final java.lang.String s = fr.emn.atlanmod.uml.casestudy.rewrite.OCL.gen(e.getType());
    if (((com.google.common.base.Objects.equal(s, "Set")) || (com.google.common.base.Objects.equal(s, "OrderedSet"))) || (com.google.common.base.Objects.equal(s, "Sequence"))) {
        return true;
    }else {
        return false;
    }
}