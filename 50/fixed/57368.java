public boolean passTime() {
    if ((shoppingTime) <= 0) {
        shop.sendToTill(this);
        java.lang.System.out.println(((name) + " goes to till"));
        return true;
    }else {
        shoppingTime -= aston.resources.Config.secondsPerTick;
        return false;
    }
}