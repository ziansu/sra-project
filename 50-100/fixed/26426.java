@java.lang.Override
public java.lang.String[] getAllPropertyValues() {
    java.util.List<java.lang.String> values = new java.util.ArrayList<java.lang.String>();
    for (com.samdlc.jini.IProperty prop : properties) {
        values.add(prop.getValue());
    }
    return values.toArray(new java.lang.String[0]);
}