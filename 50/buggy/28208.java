public float getColorWeight(int color) {
    synchronized(mColors) {
        if (mColors.containsKey(color)) {
            mColors.get(color);
        }
        return 0;
    }
}