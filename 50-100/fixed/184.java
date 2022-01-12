@java.lang.Override
public void mapBtoA(de.egore911.hexanalyzer.ui.dto.Binary b, de.egore911.hexanalyzer.persistence.model.BinaryEntity a, ma.glasnost.orika.MappingContext context) {
    if (org.apache.commons.collections4.CollectionUtils.isNotEmpty(b.getGroupIds())) {
        a.setGroups(new de.egore911.hexanalyzer.persistence.dao.GroupDao().findByIds(b.getGroupIds()));
    }else {
        a.setGroups(null);
    }
    a.setData(((b.getData()) != null ? b.getData().replaceAll("[^0-9a-fA-F]+", "") : null));
}