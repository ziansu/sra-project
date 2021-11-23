@java.lang.SuppressWarnings(value = { "unchecked" , "rawtypes" })
private void addNewGoogleGuavaClasses() {
    nl.jqno.equalsverifier.internal.ConditionalInstantiator range = new nl.jqno.equalsverifier.internal.ConditionalInstantiator(((nl.jqno.equalsverifier.JavaApiPrefabValues.GUAVA_PACKAGE) + "Range"), false);
    addValues(range.resolve(), range.callFactory("open", classes(java.lang.Comparable.class, java.lang.Comparable.class), objects(1, 2)), range.callFactory("open", classes(java.lang.Comparable.class, java.lang.Comparable.class), objects(3, 4)));
    java.lang.String optional = "com.google.common.base.Optional";
    addFactory(classForName(optional), new nl.jqno.equalsverifier.ReflectiveGenericContainerFactory(optional));
}