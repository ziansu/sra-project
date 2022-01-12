@java.lang.Override
public void updateEntity() {
    super.updateEntity();
    if (!(worldObj.isRemote)) {
        java.lang.System.out.println(("shouldProcess: " + (shouldProcess)));
    }
    if ((inventoryStacks[0]) == null) {
        shouldSearch = false;
    }else
        if ((!(worldObj.isRemote)) && (shouldSearch)) {
            search();
        }
    
}