@java.lang.Override
public void run() {
    snake.Move();
    if ((snake.getLength()) > (levelEndTreshold))
        notyfyLevelEnd();
    
}