@java.lang.Override
public void onUpdate() {
    super.onUpdate();
    if (fishHookIsOverTimeToLive()) {
        this.setDead();
    }
    bounceFromGround();
    if (this.inGround) {
        return ;
    }
    moveSomeStuff();
}