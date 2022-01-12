protected void visitMethod(petablox.program.SootMethod m) {
    petablox.program.SootMethod s = petablox.util.soot.StubMethodSupport.getStub(m);
    if (s == null)
        s = m;
    
    if ((s.isConcrete()) && (methods.add(s))) {
        if (petablox.program.RTA.DEBUG)
            java.lang.System.out.println(("\tAdding method: " + s));
        
        s.retrieveActiveBody();
        methodWorklist.add(s);
    }
}