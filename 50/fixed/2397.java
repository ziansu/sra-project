public template.propBoxDialog displayPropBoxDialog(java.lang.String msg, java.util.Vector props, java.lang.String id) {
    java.awt.Frame top = getTopLevelParent(this);
    template.propBoxDialog d = new template.propBoxDialog(top, msg, props, id, null);
    return d;
}