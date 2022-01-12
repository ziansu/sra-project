@java.lang.Override
@org.springframework.transaction.annotation.Transactional(readOnly = true, propagation = org.springframework.transaction.annotation.Propagation.REQUIRES_NEW, rollbackFor = java.lang.Exception.class)
public java.util.List<com.nagarro.gde.dto.AllApplicationAdvanceDataDTO> getApplicationExtendedDataList(final java.util.Locale locale, final com.nagarro.gde.dto.AllApplicationFilterDto allApplicationFilterDto) {
    return getApplicationExtendedDataList(locale, allApplicationFilterDto, null, null);
}