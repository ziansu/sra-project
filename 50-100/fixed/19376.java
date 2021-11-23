private org.apache.directory.studio.ldapbrowser.core.model.IValue[] getValuesToPaste() {
    if (((getInput()) instanceof org.apache.directory.studio.ldapbrowser.core.model.IEntry) || ((getInput()) instanceof org.apache.directory.studio.ldapbrowser.core.model.AttributeHierarchy)) {
        java.lang.Object content = getFromClipboard(org.apache.directory.studio.ldapbrowser.common.dnd.ValuesTransfer.getInstance());
        if (content instanceof org.apache.directory.studio.ldapbrowser.core.model.IValue[]) {
            org.apache.directory.studio.ldapbrowser.core.model.IValue[] values = ((org.apache.directory.studio.ldapbrowser.core.model.IValue[]) (content));
            return values;
        }
    }
    return null;
}