@java.lang.Override
public boolean accepts(java.lang.String name) {
    return (name != null) && (regex.test(name));
}