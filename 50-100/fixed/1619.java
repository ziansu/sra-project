private static void waveInitiationLogic(float mouseX, float mouseY) {
    if (main.Main.startWave.isClicked(mouseX, mouseY)) {
        main.Main.isEditPhase = !(main.Main.isEditPhase);
        int i = 0;
        for (grid.Grid g : main.Main.gridsReadOnly) {
            main.Main.grids.add(i, g.copy());
            main.Main.grids.remove((i + 1));
            i++;
        }
    }
}