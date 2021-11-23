@java.lang.Override
public void onUpdate() {
    super.onUpdate();
    if (fishHookIsOverTimeToLive()) {
        this.setDead();
    }
    if ((bounceFromGround()) || (this.inGround)) {
        return ;
    }
    moveSomeStuff();
}