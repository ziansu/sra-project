public java.lang.String getUserName() {
    java.lang.String result = null;
    jmri.NamedBean b;
    if (isEditable()) {
        result = getEditor().getItem().toString();
        result = (null != result) ? jmri.NamedBean.normalizeUserName(result) : "";
        b = getNamedBean();
    }else {
        b = getSelectedBean();
    }
    if (null != b) {
        result = b.getUserName();
    }
    return result;
}