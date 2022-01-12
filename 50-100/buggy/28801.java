private void processMethodBody(soot.Body body) {
    preProcessBody(body);
    soottocfg.soot.util.MethodInfo mi = new soottocfg.soot.util.MethodInfo(body.getMethod(), soottocfg.soot.util.SootTranslationHelpers.v().getCurrentSourceFileName());
    soottocfg.soot.visitors.SootStmtSwitch ss = new soottocfg.soot.visitors.SootStmtSwitch(body, mi);
    mi.setSource(ss.getEntryBlock());
    mi.finalizeAndAddToProgram();
}