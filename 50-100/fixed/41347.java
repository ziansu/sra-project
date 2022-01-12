public static org.gradoop.common.model.impl.properties.PropertyValue combine(org.gradoop.common.model.impl.properties.PropertyValue first, org.gradoop.common.model.impl.properties.PropertyValue second) {
    java.util.List<org.gradoop.common.model.impl.properties.PropertyValue> values;
    if (first.isList()) {
        values = first.getList();
    }else {
        values = new java.util.ArrayList<>();
        values.add(first);
    }
    if (second.isList()) {
        values.addAll(second.getList());
    }else {
        values.add(second);
    }
    return org.gradoop.common.model.impl.properties.PropertyValue.create(values);
}