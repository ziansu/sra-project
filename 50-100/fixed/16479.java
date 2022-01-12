private static java.lang.String getList(java.lang.String list_name) {
    if (com.kerbybit.chattriggers.objects.ListHandler.lists.containsKey(list_name)) {
        java.lang.StringBuilder return_string = new java.lang.StringBuilder("[");
        for (java.lang.String value : com.kerbybit.chattriggers.objects.ListHandler.lists.get(list_name)) {
            return_string.append(value).append(",");
        }
        return_string = new java.lang.StringBuilder(((return_string.substring(0, ((return_string.length()) - 1))) + "]"));
        return return_string.toString();
    }
    return "[]";
}