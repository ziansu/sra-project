@java.lang.Override
public void remove() {
    java.util.Map.Entry<java.lang.String, V> entry = next();
    mObject.deleteProperty(entry.getKey());
}