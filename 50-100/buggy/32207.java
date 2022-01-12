private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    java.lang.String prefix = ((java.lang.String) (in.readObject()));
    java.lang.String uri = ((java.lang.String) (in.readObject()));
    in.defaultReadObject();
    namespace = org.dom4j.Namespace.get(prefix, uri);
}