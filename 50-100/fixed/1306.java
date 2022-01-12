public static java.lang.String getObjective() {
    java.lang.String o = null;
    int pos;
    while (true) {
        pos = ((int) (1 + ((java.lang.Math.random()) * 14)));
        if ((war.Objective.objectives.get(pos)) != null) {
            o = war.Objective.objectives.get(pos);
            war.Objective.objectives.remove(pos);
            break;
        }else
            if (war.Objective.objectives.isEmpty()) {
                break;
            }
        
    } 
    return o;
}