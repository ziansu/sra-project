@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((obj != null) && ((this.getClass()) == (obj.getClass()))) {
        return value.equals(((org.jahia.modules.external.ExternalValueImpl) (obj)).value);
    }else {
        return ((obj != null) && (obj instanceof org.jahia.modules.external.Value)) && (obj.equals(value));
    }
}