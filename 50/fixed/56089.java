@java.lang.Override
public void updateLogic() {
    if (((y) < 0) || ((y) > ((Main.HEIGHT) - (height))))
        veloY *= -1;
    
    y += veloY;
}