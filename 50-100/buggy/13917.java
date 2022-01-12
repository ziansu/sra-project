private static final java.lang.String extractBPName(final org.compiere.model.I_I_BPartner importRecord) {
    final java.lang.String name = importRecord.getName();
    if (!(org.adempiere.util.Check.isEmpty(name, true))) {
        return name;
    }
    final java.lang.String email = importRecord.getEMail();
    if (org.adempiere.util.Check.isEmpty(email, true)) {
        return email;
    }
    return org.adempiere.impexp.bpartner.BPartnerImportHelper.extractBPValue(importRecord);
}