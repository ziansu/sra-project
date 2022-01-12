@java.lang.Override
public void updateEntity() {
    super.updateEntity();
    if (!(worldObj.isRemote)) {
        if (hasMaster()) {
            if (isMaster()) {
                doMultiBlockStuff();
            }
        }else {
            if (checkMultiBlockForm())
                setupStructure();
            
        }
    }
}