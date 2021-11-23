private int[] getJButtonIndex(javax.swing.JButton button) {
    int butIndX = 0;
    int butIndY = 0;
    for (int y = 0; y < 7; y++) {
        for (int x = 0; x < 7; x++) {
            if (button == (((view.View) (view)).getButton(x, y))) {
                butIndX = x;
                butIndY = y;
            }
        }
    }
    return new int[]{ butIndX , butIndY };
}