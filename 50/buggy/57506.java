@java.lang.Override
public void loop() {
    move();
    overScreen(x, y);
    shoot();
    checkDestruction();
}