protected int addPlates(int count) {
    if (!(skinCompleted)) {
        int addition = java.lang.Math.min(count, java.lang.Math.max(((com.builtbroken.icbm.content.launcher.launcher.standard.StandardMissileCrafting.MAX_PLATE_COUNT) - (platesContained)), 0));
        if (addition > 0) {
            platesContained += addition;
            plateLevel = (platesContained) / (com.builtbroken.icbm.content.launcher.launcher.standard.StandardMissileCrafting.PLATE_PER_LEVEL_COUNT);
            if ((platesContained) >= (com.builtbroken.icbm.content.launcher.launcher.standard.StandardMissileCrafting.MAX_PLATE_COUNT)) {
                skinCompleted = true;
            }
        }
        return addition;
    }
    return 0;
}