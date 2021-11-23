private void setAirplaneMode2(int flag) {
    java.util.List<java.lang.String> cmds = new java.util.ArrayList<java.lang.String>();
    cmds.clear();
    cmds.add(("/system/bin/am broadcast -a android.intent.action.AIRPLANE_MODE --ez state " + (flag == 1 ? "true" : "false")));
    try {
        doCmds(cmds);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}