private void initTransient() {
    ciph_dirs = com.redhat.ckey.applet.JCSystem.makeTransientByteArray(com.redhat.ckey.applet.CardEdge.MAX_NUM_KEYS, JCSystem.CLEAR_ON_DESELECT);
    nonce = com.redhat.ckey.applet.JCSystem.makeTransientByteArray(com.redhat.ckey.applet.CardEdge.NONCE_SIZE, JCSystem.CLEAR_ON_RESET);
    loginCount = com.redhat.ckey.applet.JCSystem.makeTransientShortArray(com.redhat.ckey.applet.CardEdge.MAX_NUM_PINS, JCSystem.CLEAR_ON_RESET);
    cardResetProcessed = com.redhat.ckey.applet.JCSystem.makeTransientBooleanArray(((short) (1)), JCSystem.CLEAR_ON_RESET);
    transientInit = true;
}