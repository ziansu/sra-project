public boolean isLightOutOfBounds(int x, int y) {
    return (((x >= (com.captainhampton.android.lightsout.fragment.FragmentClassic.NUM_ROWS)) || (x < 0)) || (y >= (com.captainhampton.android.lightsout.fragment.FragmentClassic.NUM_COLS))) || (y < 0);
}