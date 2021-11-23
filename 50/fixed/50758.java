@java.lang.Override
public void passAccessory(com.lumens.model.AccessoryManager mgr) {
    if ((accessoryMgr) == null)
        accessoryMgr = mgr;
    else
        if ((accessoryMgr) != mgr)
            accessoryMgr.pass(mgr);
        
    
}