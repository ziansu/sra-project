private void refreshRectangleColors() {
    int[] colors = new int[10];
    int len = segmentView.squares.size();
    for (int i = 0; i < len; i++)
        colors[i] = segmentView.squares.get(i).getPaint().getColor();
    
    for (int i = 0; i < 10; i++) {
        segmentView.squares.get(permutations[segmentView.permutationID][i]).setColor(colors[i]);
    }
}