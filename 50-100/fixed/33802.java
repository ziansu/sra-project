private void setAirplaneMode1(int flag) {
    java.util.List<java.lang.String> cmds = new java.util.ArrayList<java.lang.String>();
    cmds.clear();
    cmds.add(("settings put global airplane_mode_on " + flag));
    try {
        doCmds(cmds);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}