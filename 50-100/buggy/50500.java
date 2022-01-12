private void swapTopBlocks(com.example.jumping_ball.Gameplay.Block origin, com.example.jumping_ball.Gameplay.Block destiny) {
    com.example.jumping_ball.Gameplay.Board.ChangedBlocks changed;
    java.lang.Object[] partsOrigin = origin.getChildreen();
    int originlenght = origin.getChildreenCount();
    int destinylenght = destiny.getChildreenCount();
    int delta = originlenght - destinylenght;
    int count = 0;
    com.example.jumping_ball.Gameplay.Block[] bchanged = origin.UnStrackBlocks(delta);
    for (int i = 0; i < delta; i++) {
        destiny.StackBlock(bchanged[i]);
    }
}