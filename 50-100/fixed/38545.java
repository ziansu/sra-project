@org.jetbrains.annotations.Nullable
@java.lang.Override
public org.jdom.Element getState() {
    final org.jdom.Element element = new org.jdom.Element("EASettings");
    if (null != (this.versionOldest)) {
        element.setAttribute("version", this.version);
    }
    if (null != (this.versionOldest)) {
        element.setAttribute("versionOldest", this.versionOldest);
    }
    if (null != (this.uuid)) {
        element.setAttribute("uuid", this.uuid);
    }
    return element;
}