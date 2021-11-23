@java.lang.Override
public void passAccessory(com.lumens.model.AccessoryManager mgr) {
    if ((accessoryMgr) == null)
        accessoryMgr = mgr;
    else
        accessoryMgr.pass(mgr);
    
}