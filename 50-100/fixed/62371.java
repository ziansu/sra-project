public void approveSpecfiedNumberOfPartimers(int numPartimersToApporve, java.lang.String hoEmail) {
    for (int i = 1; i <= numPartimersToApporve; i++) {
        java.lang.System.out.println(((("Beginnging to Approve Partimer: " + i) + "- for Job created by: ") + hoEmail));
        selectPartimerCheckbox(java.lang.String.valueOf(i));
        openActionsListPopup(java.lang.String.valueOf(i));
        clickOnApprove(java.lang.String.valueOf(i));
        java.lang.System.out.println("Partimer Approved Sucessfully");
    }
}