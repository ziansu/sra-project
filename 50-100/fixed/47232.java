private static java.lang.String findLevelName(int level) {
    java.util.List<java.lang.Integer> allLevels = new java.util.ArrayList<java.lang.Integer>(com.baalam.mobile.exercisebooster.util.UserLevel.levelsNames.keySet());
    java.util.Collections.sort(allLevels);
    for (java.lang.Integer iLevel : allLevels) {
        if (level <= iLevel)
            return com.baalam.mobile.exercisebooster.util.UserLevel.levelsNames.get(iLevel);
        
    }
    return com.baalam.mobile.exercisebooster.util.UserLevel.DEFAULT_LEVEL;
}