public java.util.List<java.lang.String> getActions() {
    java.lang.String value = actions.getProperty(com.zestedesavoir.zestwriter.utils.Configuration.ActionData.LastProjects.getKey());
    if (value != null) {
        return java.util.Arrays.asList(value.split(","));
    }else {
        return new java.util.ArrayList<>();
    }
}