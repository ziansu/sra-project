public java.lang.String getDisplayName() {
    java.lang.String result = null;
    jmri.NamedBean b = null;
    if (isEditable()) {
        result = getText();
        result = (null != result) ? jmri.NamedBean.normalizeUserName(result) : "";
        b = getNamedBean();
    }else {
        b = getSelectedBean();
    }
    if (null != b) {
        result = b.getDisplayName();
    }
    return result;
}