private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    out.writeObject(namespace.getPrefix());
    out.writeObject(namespace.getURI());
    out.defaultWriteObject();
}