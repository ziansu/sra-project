private static java.lang.String getValue(java.lang.String list_name, int position) throws java.lang.NumberFormatException {
    java.util.List<java.lang.String> entries = com.kerbybit.chattriggers.objects.ListHandler.lists.get(list_name);
    if ((position < (entries.size())) && (position >= 0))
        return entries.get(position);
    
    throw new java.lang.NumberFormatException();
}