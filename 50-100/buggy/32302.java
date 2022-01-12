private static void clearNullProp(java.util.List<com.github.me10zyl.entity.ClassProperty> list) {
    java.util.List<com.github.me10zyl.entity.ClassProperty> deleting = new java.util.ArrayList<>();
    for (com.github.me10zyl.entity.ClassProperty c : list) {
        if (c.isPlaceHolder()) {
            deleting.add(c);
        }
    }
    for (com.github.me10zyl.entity.ClassProperty delete : deleting) {
        list.remove(delete);
    }
}