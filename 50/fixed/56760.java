public void checkIR(boolean hlt) {
    try {
        if (hlt) {
            java.lang.Thread.sleep(3600);
        }
    } catch (java.lang.InterruptedException e) {
        throw new com.zms.zpc.execute.NotImplException(e);
    }
}