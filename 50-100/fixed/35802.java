public boolean isTrigger() throws org.md2k.datakitapi.exception.DataKitException {
    getProbability();
    java.util.Random generator = new java.util.Random();
    double number = generator.nextDouble();
    emiInfo.random = number;
    if (number >= (emiInfo.probability))
        emiInfo.isTriggered = true;
    else
        emiInfo.isTriggered = false;
    
    emiHistoryManager.insert(emiInfo);
    return emiInfo.isTriggered;
}