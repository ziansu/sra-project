public void draw() {
    if ((taskPosition) >= (game.tasks.size())) {
        (taskPosition)--;
    }
    applet.translate(20, ((CONTROL_HEIGHT) - 100));
    if ((game.tasks.size()) > 0) {
        applet.text(game.tasks.get(taskPosition).getName(), 0, 0);
    }else {
        applet.text("No tasks available", 0, 0);
    }
}