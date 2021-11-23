@java.lang.Override
public void updateViewState() {
    java.lang.Object value = getModel().getValue();
    java.lang.Class itemClass = getModel().getItemClass();
    java.util.Set<java.lang.Object> set = com.talk2object.plum.interaction.rich.field.CollectionType.convert(value, itemClass, getModel().getCollectionType(), java.util.Set.class);
    getView().setSelectedValues(set);
}