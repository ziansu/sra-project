public static java.util.ArrayList<com.nakamagaming.dd5espells.Spell> filterByClass(java.util.ArrayList<com.nakamagaming.dd5espells.Spell> list, java.util.ArrayList<com.nakamagaming.dd5espells.helpers.ClassType> classTypes) {
    java.util.ArrayList<com.nakamagaming.dd5espells.Spell> result = new java.util.ArrayList<>();
    for (com.nakamagaming.dd5espells.Spell spell : list) {
        for (com.nakamagaming.dd5espells.helpers.ClassType classType : spell.getClassTypes()) {
            if (classTypes.contains(classType))
                result.add(spell);
            
        }
    }
    return result;
}