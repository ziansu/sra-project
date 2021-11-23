private static java.util.ArrayList<java.lang.String> getListObject(java.lang.String list_name) {
    if (com.kerbybit.chattriggers.objects.ListHandler.lists.containsKey(list_name))
        return new java.util.ArrayList<>(com.kerbybit.chattriggers.objects.ListHandler.lists.get(list_name));
    
    return null;
}