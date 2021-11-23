public java.util.Map<fr.utbm.info.vi51.framework.math.Point2f, java.lang.Integer> solveConflicts() {
    java.util.Map<fr.utbm.info.vi51.framework.math.Point2f, java.lang.Integer> z = new java.util.HashMap<fr.utbm.info.vi51.framework.math.Point2f, java.lang.Integer>();
    for (fr.utbm.info.vi51.framework.environment.Influence influence : influences) {
        if (influence instanceof wave.behavior.ExpandInfluence) {
            java.lang.System.out.println("Extand");
            z = expand(((wave.behavior.ExpandInfluence) (influence)), z);
        }else
            if (influence instanceof wave.behavior.GenerateInfluence) {
                z = generate(((wave.behavior.GenerateInfluence) (influence)), z);
            }
        
    }
    return z;
}