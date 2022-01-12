public float getColorWeight(int color) {
    synchronized(mColors) {
        if (mColors.containsKey(color)) {
            return mColors.get(color);
        }
        return 0;
    }
}