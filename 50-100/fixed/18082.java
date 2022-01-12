@java.lang.SuppressWarnings(value = "unchecked")
public void recreateUserdata(java.io.InputStream in) throws java.io.IOException {
    try (java.io.ObjectInputStream stream = new java.io.ObjectInputStream(in)) {
        this.users = ((java.util.HashMap<java.lang.String, de.janbo.jarvys.User>) (stream.readObject()));
    } catch (java.lang.ClassNotFoundException e) {
        e.printStackTrace();
        this.users = new java.util.HashMap<>();
    }
}