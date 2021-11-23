public java.lang.String getAsFormattedString(java.text.DateFormat dateFormat) throws org.eclipse.osee.framework.jdk.core.type.OseeCoreException {
    java.util.Date date = getValue();
    return date != null ? dateFormat.format(date) : "";
}