@java.lang.Override
public java.lang.String getLabel(com.krishagni.catissueplus.core.administrative.domain.StorageContainer container) {
    com.krishagni.catissueplus.core.administrative.domain.StorageContainer parent = container.getParentContainer();
    return parent == null ? org.apache.commons.lang3.StringUtils.EMPTY : parent.getName();
}