public soot.jimple.parser.Body getBody(soot.jimple.parser.SootMethod m) {
    if ((methodToParsedBodyMap) == null) {
        synchronized(this) {
            if ((methodToParsedBodyMap) == null)
                stashBodiesForClass(m.getDeclaringClass());
            
        }
    }
    return methodToParsedBodyMap.get(m);
}