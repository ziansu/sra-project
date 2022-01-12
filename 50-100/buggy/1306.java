public static java.lang.String getObjective() {
    java.lang.String o;
    int pos;
    while (true) {
        pos = ((int) (1 + ((java.lang.Math.random()) * 14)));
        if ((war.Objective.objectives.get(pos)) != null) {
            o = war.Objective.objectives.get(pos);
            war.Objective.objectives.remove(pos);
            break;
        }
    } 
    return o;
}