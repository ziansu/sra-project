@org.jetbrains.annotations.Nullable
@java.lang.Override
public org.jdom.Element getState() {
    final org.jdom.Element element = new org.jdom.Element("EASettings");
    element.setAttribute("version", this.version);
    element.setAttribute("versionOldest", this.versionOldest);
    element.setAttribute("uuid", this.uuid);
    return element;
}