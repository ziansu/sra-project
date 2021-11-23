public boolean isStable(wjtoth.cyclicstablematching.PreferenceSystem preferenceSystem) {
    if (quickChecks(preferenceSystem)) {
        return true;
    }
    if (((preferenceSystem.length) >= 3) && (slowChecks(preferenceSystem))) {
        return true;
    }
    return false;
}