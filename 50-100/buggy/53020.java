@java.lang.Override
public java.lang.String getLabel(com.krishagni.catissueplus.core.administrative.domain.StorageContainer container) {
    com.krishagni.catissueplus.core.administrative.domain.StorageContainer parent = container.getParentContainer();
    if (parent == null) {
        return org.apache.commons.lang3.StringUtils.EMPTY;
    }
    java.lang.Long uniqueId = daoFactory.getUniqueIdGenerator().getUniqueId(name, parent.getName());
    return com.krishagni.catissueplus.core.common.util.SchemeOrdinalConverterUtil.fromOrdinal(StorageContainer.UPPER_CASE_ALPHA_LABELING_SCHEME, uniqueId.intValue());
}