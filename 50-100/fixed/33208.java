public void setImplClass(com.krishagni.catissueplus.core.administrative.domain.AutoFreezerProviderDetail detail, com.krishagni.catissueplus.core.administrative.domain.AutoFreezerProvider provider, com.krishagni.catissueplus.core.common.errors.OpenSpecimenException ose) {
    if (org.apache.commons.lang3.StringUtils.isBlank(detail.getImplClass())) {
        ose.addError(AutoFreezerProviderErrorCode.CLASS_REQ);
        return ;
    }
    try {
        java.lang.Class.forName(detail.getImplClass());
        provider.setImplClass(detail.getImplClass());
    } catch (java.lang.Exception e) {
        ose.addError(AutoFreezerProviderErrorCode.INVALID_CLASS, detail.getImplClass(), e.toString());
    }
}