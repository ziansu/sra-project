public static java.lang.Object readObject(android.content.Context context, java.lang.String key) throws java.io.IOException, java.lang.ClassNotFoundException {
    java.io.FileInputStream fis = context.openFileInput(key);
    java.io.ObjectInputStream ois = new java.io.ObjectInputStream(fis);
    java.lang.Object object = ois.readObject();
    return object;
}