@java.lang.Override
protected final void handleClassPrepareEvent(com.sun.jdi.VirtualMachine vm, com.sun.jdi.event.ClassPrepareEvent event) {
    com.sun.jdi.ReferenceType refType = event.referenceType();
    if (refType.name().equals(sav.strategies.junit.SavJunitRunner.ENTER_TC_BKP.getClassCanonicalName())) {
        junitLoc = addBreakpointWatch(vm, refType, sav.strategies.junit.SavJunitRunner.ENTER_TC_BKP.getLineNo());
    }
}