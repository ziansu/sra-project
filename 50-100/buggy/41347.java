public static org.gradoop.common.model.impl.properties.PropertyValue combine(org.gradoop.common.model.impl.properties.PropertyValue first, org.gradoop.common.model.impl.properties.PropertyValue second) {
    java.util.List<org.gradoop.common.model.impl.properties.PropertyValue> values = (first.isList()) ? first.getList() : new java.util.ArrayList<>();
    if (second.isList()) {
        values.addAll(second.getList());
    }else {
        values.add(second);
    }
    return org.gradoop.common.model.impl.properties.PropertyValue.create(values);
}