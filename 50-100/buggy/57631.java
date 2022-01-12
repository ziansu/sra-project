public void complete_building() {
    if (mcrl) {
        try {
            rebeca.wrebeca.common.Trans.write_mcrl2(rebeca.wrebeca.common.VisitedGlobalstates.getInstance(), allInitializedState);
        } catch (java.io.IOException e1) {
        }
    }
    if (lts) {
        try {
            rebeca.wrebeca.common.Trans.write_aut(false);
        } catch (java.io.IOException e) {
        }
    }
    timer.cancel();
    java.lang.System.exit(0);
}