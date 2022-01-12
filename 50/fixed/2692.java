@java.lang.Override
public void die() {
    gb.unregister(this);
    gEng.enemies.remove(this);
}