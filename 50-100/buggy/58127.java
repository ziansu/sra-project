public java.lang.String openDialog() throws org.eclipse.epsilon.eol.exceptions.EolInternalException {
    try {
        new java.lang.Thread(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                java.lang.String ref = org.eclipse.epsilon.emc.ptcim.com4j.Com4jPtcimFileDialog.dialog.create(true);
                setChanged();
                notifyObservers(ref);
            }
        }).start();
        java.lang.System.out.println("before dialog");
        return ((java.lang.String) ("hhh"));
    } catch (java.lang.Exception e) {
        throw new org.eclipse.epsilon.eol.exceptions.EolInternalException(e);
    } finally {
        java.lang.System.out.println("finally");
    }
}