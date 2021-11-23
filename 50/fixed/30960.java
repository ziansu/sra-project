@java.lang.Override
public void update() {
    (time)++;
    if ((time) > (timeLimit)) {
        resetHealth();
        time = 0;
    }
}