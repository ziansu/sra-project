@java.lang.Override
public java.lang.String getDisplayName() {
    java.lang.String name = getUserName();
    if ((name != null) && (!(name.isEmpty()))) {
        return name;
    }else {
        return getSystemName();
    }
}