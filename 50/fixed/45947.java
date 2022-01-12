@java.lang.Override
public void addCriteria(com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
    com.liferay.portal.kernel.dao.orm.Property nameProperty = com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil.forName("name");
    dynamicQuery.add(nameProperty.eq(name));
}