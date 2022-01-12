public static void main(java.lang.String[] args) {
    d.datalog.XSBSubprocessEngine engine = new d.datalog.XSBSubprocessEngine("D:\\XSB\\bin\\xsb64.bat");
    if (engine.deterministicGoal("javaMessage('java.lang.System'-out,println(string('Hello from Prolog, Java world!')))"))
        java.lang.System.out.println("This goal succeeded");
    
    java.io.File f = new java.io.File("D:\\XSB\\prolog-commons\\p.P");
    engine.consultAbsolute(f);
    java.lang.String RVars = null;
    java.lang.Object[] c = null;
    c = engine.deterministicGoal("p(1,X)", RVars);
    java.lang.System.out.println(c[0]);
    d.datalog.SolutionIterator e = engine.goal("p(1,X)", RVars);
    engine.shutdown();
}