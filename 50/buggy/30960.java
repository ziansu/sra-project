@java.lang.Override
public void update() {
    (time)++;
    if ((time) > (timeLimit)) {
        this.resetHealth();
        this.time = 0;
    }
}