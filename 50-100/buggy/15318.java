@org.junit.Test
public void testSingleScriptFunction() throws java.lang.Exception {
    debugger.addResponse("Stop", Debugger.Response.Ignore);
    debugger.addResponse("No", Debugger.Response.Choose);
    script.say("In main script.");
    assertEquals(TeaseScript.Timeout, script.reply(new teaselib.ScriptFunction() {
        @java.lang.Override
        public void run() {
            script.say("Inside script function.");
        }
    }, "Stop"));
    script.say("Resuming main script");
}