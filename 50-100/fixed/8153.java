public void addAvailableLevel(int i, int numStars, app.Game g) {
    view.AvailableLevelView av = new view.AvailableLevelView(i);
    if (numStars != (-1)) {
        av.unlockLevel(numStars);
        addListenerToButton(i, g);
    }
    levels.add(av);
    scrollablePanel.add(av);
}