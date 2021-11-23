public void replaceOrganizationCodeTo003Tag(org.marc4j.marc.Record record) {
    java.lang.String organizationCode = org.kuali.rice.core.api.config.property.ConfigContext.getCurrentContextConfig().getProperty("organization.marc.code");
    if (getMarcRecordUtil().hasField(record, OleNGConstants.TAG_003)) {
        java.lang.String controlField003Value = getMarcRecordUtil().getControlFieldValue(record, OleNGConstants.TAG_003);
        if (org.apache.commons.lang3.StringUtils.isBlank(controlField003Value)) {
            getMarcRecordUtil().updateControlFieldValue(record, OleNGConstants.TAG_003, organizationCode);
        }
    }else {
        getMarcRecordUtil().addControlField(record, OleNGConstants.TAG_003, organizationCode);
    }
}