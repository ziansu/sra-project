@java.lang.Override
public java.util.List<com.gdpost.web.entity.component.TuiBaoModel> getNetTuiBaoWarnningWithPolicyDateAndCsDate(java.lang.String organCode, java.lang.String d1, java.lang.String d2, java.lang.String d3, java.lang.String d4, java.lang.String prdCode, java.lang.String toPerm, java.lang.String staffFlag, java.lang.String bankNaem) {
    return cmDAO.getNetTuiBaoWarningWithPolicyDateAndCsDate(organCode, d1, d2, d3, d4, prdCode, toPerm, staffFlag, bankNaem);
}