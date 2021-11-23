private void initEnergy() {
    for (int i = 0; i < (height); i++) {
        for (int j = 0; j < (width); j++) {
            P_energy[i][j] = java.lang.Math.sqrt(centerDiff(j, i, pic));
        }
    }
}