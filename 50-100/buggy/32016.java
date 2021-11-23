public static java.lang.String getDN(org.cilogon.d2.storage.User user, org.cilogon.d2.util.CILServiceTransactionInterface transaction) {
    switch (org.cilogon.d2.util.DNUtil.getCase(user)) {
        case org.cilogon.d2.util.DNUtil.LIGO_CASE :
            return org.cilogon.d2.util.DNUtil.getLIGODN(user);
        case org.cilogon.d2.util.DNUtil.FNL_CASE :
            if (org.cilogon.d2.util.DNUtil.isComputeFNAL()) {
                return org.cilogon.d2.util.DNUtil.getFNLDN(user);
            }
        case org.cilogon.d2.util.DNUtil.OPENID_CASE :
        case org.cilogon.d2.util.DNUtil.DEFAULT_CASE :
        default :
            return org.cilogon.d2.util.DNUtil.getDefaultDN(user, transaction);
    }
}