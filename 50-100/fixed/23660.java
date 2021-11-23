private static java.lang.String getRandomValue(java.lang.String list_name) {
    if (com.kerbybit.chattriggers.objects.ListHandler.lists.containsKey(list_name)) {
        java.util.List<java.lang.String> list = com.kerbybit.chattriggers.objects.ListHandler.lists.get(list_name);
        int randInt = com.kerbybit.chattriggers.triggers.EventsHandler.randInt(0, ((list.size()) - 1));
        return list.get(randInt);
    }
    return "Empty list";
}