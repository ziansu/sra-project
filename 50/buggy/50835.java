public void updateEntity() {
    if (worldObj.isRemote)
        return ;
    
    super.updateEntity();
}