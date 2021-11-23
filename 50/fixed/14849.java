public java.lang.Iterable<org.oreland.teambuilder.entity.Activity> getSortedActivities(java.util.Comparator<org.oreland.teambuilder.entity.Activity> comp) {
    java.util.List<org.oreland.teambuilder.entity.Activity> list = new java.util.ArrayList<>();
    list.addAll(activities.values());
    java.util.Collections.sort(list, comp);
    return list;
}