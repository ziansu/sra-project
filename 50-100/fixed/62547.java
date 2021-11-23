public static boolean contains(org.osate.xtext.aadl2.errormodel.errorModel.ErrorType supertype, org.osate.xtext.aadl2.errormodel.errorModel.ErrorType type) {
    if ((supertype == null) || (type == null)) {
        return true;
    }
    org.osate.xtext.aadl2.errormodel.errorModel.ErrorType resolvedtype = org.osate.xtext.aadl2.errormodel.util.EMV2Util.resolveAlias(type);
    org.osate.xtext.aadl2.errormodel.errorModel.ErrorType resolvedsupertype = org.osate.xtext.aadl2.errormodel.util.EMV2Util.resolveAlias(supertype);
    while (resolvedtype != null) {
        if (resolvedtype == resolvedsupertype) {
            return true;
        }else {
            resolvedtype = org.osate.xtext.aadl2.errormodel.util.EMV2Util.resolveAlias(resolvedtype.getSuperType());
        }
    } 
    return false;
}