protected boolean shouldConvert() {
    boolean toRet = false;
    napakalaki.Dice dice = napakalaki.Dice.getInstance();
    int randnum = dice.nextNumber();
    if (randnum == 1)
        toRet = true;
    
    return toRet;
}