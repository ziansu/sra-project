public static java.util.List<com.apps.philipps.source.helper.Animation> get(java.lang.Class clazz) {
    java.util.List<com.apps.philipps.source.helper.Animation> result = new java.util.ArrayList<>();
    for (int i : com.apps.philipps.source.helper.Animation.levels)
        for (int j = 0; j < (com.apps.philipps.source.helper.Animation.animations.get(i).size()); j++)
            if ((com.apps.philipps.source.helper.Animation.animations.get(i).get(j).getClass()) == clazz)
                result.add(com.apps.philipps.source.helper.Animation.animations.get(i).get(j));
            
        
    
    return result;
}