public static java.util.List<java.lang.String> fetchRequiredFiledNames(java.util.List<org.unicef.rapidreg.forms.Field> fields) {
    java.util.List<java.lang.String> result = new java.util.ArrayList<>();
    for (org.unicef.rapidreg.forms.Field field : fields) {
        if (field.isRequired()) {
            result.add(field.getDisplayName().get(java.util.Locale.getDefault().getLanguage()));
        }
    }
    return result;
}