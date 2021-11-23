@java.lang.Override
public void onUpdate() {
    super.onUpdate();
    if ((randomDir) == 0) {
        this.randomDir = worldObj.rand.nextInt(360);
    }
    if ((randomDir2) == 0) {
        this.randomDir2 = (worldObj.rand.nextInt(15)) + 10;
    }
}