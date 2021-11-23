public java.util.List<java.lang.String> getActions() {
    java.lang.String value = actions.getProperty(com.zestedesavoir.zestwriter.utils.Configuration.ActionData.LastProjects.getKey());
    if (value != null) {
        if (!(value.trim().equals(""))) {
            return java.util.Arrays.asList(value.split(","));
        }
        return java.util.Arrays.asList(value.split(","));
    }else {
        return new java.util.ArrayList<>();
    }
    return new java.util.ArrayList<java.lang.String>();
}