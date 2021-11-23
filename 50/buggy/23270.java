public int getRandomColor(java.lang.String word) {
    int colorNum = (word.hashCode()) % 16;
    colorNum = java.lang.Math.abs(colorNum);
    return mColors.get(colorNum);
}