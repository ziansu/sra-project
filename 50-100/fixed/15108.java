public boolean randomEventRiots() {
    java.lang.Integer count = 0;
    boolean success = false;
    java.lang.System.out.println("Checking Riots Random Event Card");
    for (ankhmorpork.GameObjects.TroubleMaker troubleMaker : ankhmorpork.Game.Game.lstTroubleMaker) {
        if ((troubleMaker.getArea_id()) > 1) {
            count++;
        }
    }
    if (count > 8) {
        java.lang.System.out.println("There were more than 8 Trouble Makers on Board. Game will end now... ");
        success = true;
        java.lang.System.out.print("\n");
        java.lang.System.exit(0);
    }else {
        java.lang.System.out.println("Your card went wasted because there weren't 8 or more Trouble Makers on board. ");
        success = true;
        java.lang.System.out.print("\n");
        return success;
    }
    return success;
}