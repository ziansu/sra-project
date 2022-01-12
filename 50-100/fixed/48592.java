@java.lang.Override
public void onUpdate() {
    super.onUpdate();
    if ((randomDir) == 0) {
        randomDir = worldObj.rand.nextInt(360);
    }
    if ((randomDir2) == 0) {
        randomDir2 = (worldObj.rand.nextInt(15)) + 10;
    }
}