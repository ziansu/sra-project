@java.lang.Override
public void updateEntity() {
    super.updateEntity();
    if ((inventoryStacks[0]) == null) {
        shouldSearch = false;
    }else
        if ((!(worldObj.isRemote)) && (shouldSearch)) {
            search();
        }
    
}