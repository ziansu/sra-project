public void runOrder() {
    snake.Colors.pause(500);
    java.util.Iterator<javax.swing.JButton> iterator = order.iterator();
    setEnabledButtons(true);
    javax.swing.JButton button;
    while (iterator.hasNext()) {
        button = iterator.next();
        java.lang.System.out.println(button.getName());
        snake.Colors.changeColor(300, button);
    } 
    setEnabledButtons(true);
}