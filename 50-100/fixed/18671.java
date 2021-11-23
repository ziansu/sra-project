public static boolean contains(org.osate.xtext.aadl2.errormodel.errorModel.ErrorTypes constraint, org.osate.xtext.aadl2.errormodel.errorModel.TypeSet type) {
    if (constraint == null) {
        return true;
    }
    if (constraint instanceof org.osate.xtext.aadl2.errormodel.errorModel.ErrorType) {
        return org.osate.xtext.aadl2.errormodel.util.EM2TypeSetUtil.contains(((org.osate.xtext.aadl2.errormodel.errorModel.ErrorType) (constraint)), type);
    }
    if (constraint instanceof org.osate.xtext.aadl2.errormodel.errorModel.TypeSet) {
        return org.osate.xtext.aadl2.errormodel.util.EM2TypeSetUtil.contains(((org.osate.xtext.aadl2.errormodel.errorModel.TypeSet) (constraint)), type);
    }
    return false;
}