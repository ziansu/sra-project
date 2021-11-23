@java.lang.Override
public boolean work() {
    boolean success = fme.attemptClaim(forFaction, this.currentLocation(), true, false);
    if (success) {
        failCount = 0;
    }else
        if (((failCount)++) >= (limit)) {
            this.stop();
            return false;
        }
    
    return true;
}