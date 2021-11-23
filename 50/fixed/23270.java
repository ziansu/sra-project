public int getRandomColor(java.lang.String word) {
    int colorNum = java.lang.Math.abs(((word.hashCode()) % 16));
    return mColors.get(colorNum);
}