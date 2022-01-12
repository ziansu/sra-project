public void testExitValueOfExec() {
    copyScriptFromRaw(R.raw.test_exit_with_n1, "test_exit_with_n1.sh");
    int ret = com.dailystudio.system.CommandShell.execAndWaitFor(new java.lang.String[]{ getAbsolutePath("test_exit_with_n1.sh") });
    assertEquals(CommandShell.ERR_NONE, com.dailystudio.system.CommandShell.getErrorCode(ret));
    assertEquals(1, com.dailystudio.system.CommandShell.getExitValue(ret));
}