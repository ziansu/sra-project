@java.lang.Override
public java.lang.Number execute(java.lang.Number expected) {
    try {
        long solution = solve();
        if (expected == null) {
            return solution;
        }else
            if ((expected.longValue()) == solution) {
                return expected;
            }else {
                return solution;
            }
        
    } catch (java.lang.Exception ex) {
        if ((ex.getMessage()) != null) {
            java.lang.System.out.println(("Could not solve: " + (ex.getMessage())));
        }
        ex.printStackTrace();
        return null;
    }
}