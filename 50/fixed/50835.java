@java.lang.Override
public void update() {
    if (worldObj.isRemote)
        return ;
    
    super.update();
}