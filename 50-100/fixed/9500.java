public static void delAll(java.util.Collection<? extends com.caberodev.squarearmy.worldobjects.WorldObject> c) {
    for (com.caberodev.squarearmy.worldobjects.WorldObject o : c) {
        for (java.lang.String key : com.caberodev.squarearmy.util.ListLinker.links.get(o)) {
            java.util.ArrayList<com.caberodev.squarearmy.worldobjects.WorldObject> list = com.caberodev.squarearmy.util.ListLinker.linker.get(key);
            list.remove(o);
        }
    }
}