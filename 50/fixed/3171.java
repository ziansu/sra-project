@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((obj == null) || (!(obj instanceof org.ballerinalang.model.values.BXMLQName))) {
        return false;
    }
    return ((org.ballerinalang.model.values.BXMLQName) (obj)).stringValue().equals(localName);
}