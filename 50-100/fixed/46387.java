public static boolean contains(org.osate.xtext.aadl2.errormodel.errorModel.TypeSet ts, org.osate.xtext.aadl2.errormodel.errorModel.ErrorType et) {
    if ((ts == null) || (et == null)) {
        return true;
    }
    ts = org.osate.xtext.aadl2.errormodel.util.EMV2Util.resolveAlias(ts);
    for (org.osate.xtext.aadl2.errormodel.errorModel.TypeToken tselement : ts.getTypeTokens()) {
        if (org.osate.xtext.aadl2.errormodel.util.EM2TypeSetUtil.contains(tselement, et)) {
            return true;
        }
    }
    return false;
}