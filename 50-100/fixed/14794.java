public static java.util.Map<java.lang.String, java.lang.Object> getArenaClasses(java.util.Map<java.lang.Integer, mc.alk.arena.objects.ArenaClass> classes) {
    java.util.HashMap<java.lang.String, java.lang.Object> map = new java.util.HashMap<java.lang.String, java.lang.Object>();
    for (java.lang.Integer teamNumber : classes.keySet()) {
        java.lang.String teamName = (teamNumber == (ArenaClass.DEFAULT.intValue())) ? "default" : "team" + (teamNumber + 1);
        map.put(teamName, classes.get(teamNumber).getName());
    }
    return map;
}