@java.lang.Override
public nl.renarj.jasdb.api.properties.Property removeValue(nl.renarj.jasdb.api.properties.Value v) {
    for (java.util.Iterator i = values.iterator(); i.hasNext();) {
        if (i.next().equals(v)) {
            i.remove();
        }
    }
    validateAndSetCollection();
    return this;
}