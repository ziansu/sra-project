private void initEnergy() {
    for (int i = 0; i < (height); i++) {
        for (int j = 0; j < (width); j++) {
            P_energy[i][j] = centerDiff(j, i, pic);
        }
    }
}