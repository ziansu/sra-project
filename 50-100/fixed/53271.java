public void LockToken() throws java.lang.InterruptedException {
    int retries = 0;
    while (retries < (burp.AntiCSRFToken.MAX_LOCK_RETRIES)) {
        if (!(isTokenBeingUsed)) {
            this.isTokenBeingUsed = true;
            return ;
        }else {
            java.lang.Thread.sleep(burp.AntiCSRFToken.SLEEP_TIME_MS);
            retries++;
        }
    } 
    java.lang.System.out.println(("Mutex Lock timeout... Releasing Lock for " + (this.sessionID)));
    this.ReleaseToken();
    return ;
}