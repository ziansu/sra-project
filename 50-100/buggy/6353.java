public static boolean contains(org.osate.xtext.aadl2.errormodel.errorModel.TypeToken constraint, org.osate.xtext.aadl2.errormodel.errorModel.ErrorType type) {
    if ((constraint == null) || (type == null)) {
        return false;
    }
    if (constraint.isNoError()) {
        return false;
    }
    org.eclipse.emf.common.util.EList<org.osate.xtext.aadl2.errormodel.errorModel.ErrorTypes> tsetype = constraint.getType();
    if ((tsetype.size()) == 1) {
        org.osate.xtext.aadl2.errormodel.errorModel.ErrorTypes errorType = tsetype.get(0);
        if (org.osate.xtext.aadl2.errormodel.util.EM2TypeSetUtil.contains(errorType, type)) {
            return true;
        }
    }
    return false;
}