@java.lang.Override
public java.lang.String getLabel(com.krishagni.catissueplus.core.administrative.domain.StorageContainer container) {
    com.krishagni.catissueplus.core.administrative.domain.StorageContainer parent = container.getParentContainer();
    if (parent == null) {
        return org.apache.commons.lang3.StringUtils.EMPTY;
    }
    return parent.getName();
}