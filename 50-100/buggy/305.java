public void popTransition(byte type) {
    cubicmadness.gamestates.GameState prev = states.peek();
    states.pop();
    cubicmadness.gamestates.GameState next = states.peek();
    states.push(new cubicmadness.gamestates.TransitionState(gp, prev, next, type));
}