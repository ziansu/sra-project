@java.lang.Override
public void addField(com.yukthi.persistence.repository.search.DynamicResultField field) {
    java.lang.Object value = field.getValue();
    value = (value == null) ? null : value.toString();
    this.extendedFields.put(field.getField(), ((java.lang.String) (value)));
}