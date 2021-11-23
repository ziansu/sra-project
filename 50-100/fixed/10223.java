@java.lang.Override
public java.lang.String[] getAllPropertyNames() {
    java.util.List<java.lang.String> names = new java.util.ArrayList<java.lang.String>();
    for (com.samdlc.jini.IProperty prop : properties) {
        names.add(prop.getName());
    }
    return names.toArray(new java.lang.String[0]);
}