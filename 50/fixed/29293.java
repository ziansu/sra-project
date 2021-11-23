public int[] getColors(synesketch.emotion.Emotion e) {
    int type = (e.getType()) + 1;
    return (type >= 0) && (type < (allColors.length)) ? allColors[type] : null;
}