private void reset() {
    project.directors.Screen startScreen = new project.directors.StartScreen(this);
    activeScreen = startScreen;
    setScreen(startScreen);
}