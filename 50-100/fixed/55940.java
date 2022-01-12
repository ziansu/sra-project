public ssm.util.KeyBean ExchTPK(java.lang.String atmID) throws ssm.util.KeyException {
    ssm.util.KeyBean currentTMK = getKey(atmID, "TPK");
    if (currentTMK == null)
        throw new ssm.util.KeyException("ATM TMK isn't inited");
    
    java.lang.String newKey = ssm.util.Des.randomKey();
    ssm.util.KeyBean newTMK = new ssm.util.KeyBean(atmID, "TPK", newKey, ssm.util.Des.Enc(newKey, "0000000000000000").substring(0, 6));
    if (findKey(atmID, "TPK"))
        updateKey(newTMK);
    else
        insertKey(newTMK);
    
    return currentTMK;
}