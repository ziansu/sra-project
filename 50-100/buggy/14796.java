public void move(ch.bfh.projekt1.sokoban.Direction direction) {
    ch.bfh.projekt1.sokoban.Activity activity = ch.bfh.projekt1.sokoban.Rules.checkCollision(model.getGameArea(), direction, model.getPawnPosition(), model.isReverse(), model.getWidth(), model.getHeight());
    if (activity != (Activity.COLLISION)) {
        model.getStackUndo().push(new ch.bfh.projekt1.sokoban.SokobanStackTuple(activity, direction));
        move(direction, activity);
    }
}