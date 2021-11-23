public void testExecErrorScript() {
    copyScriptFromRaw(R.raw.test_run_with_error, "test_run_with_error.sh");
    int ret = com.dailystudio.system.CommandShell.execAndWaitFor(new java.lang.String[]{ getAbsolutePath("test_run_with_error.sh") });
    assertEquals(CommandShell.ERR_NONE, com.dailystudio.system.CommandShell.getErrorCode(ret));
    assertEquals(127, com.dailystudio.system.CommandShell.getExitValue(ret));
}