@java.lang.Override
public java.util.Map<java.lang.String, java.lang.String> getValue() {
    java.util.Map<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
    if ((problemFibers) != null) {
        for (java.util.Map.Entry<co.paralleluniverse.fibers.Fiber, java.lang.StackTraceElement[]> e : problemFibers.entrySet())
            map.put(e.getKey().toString(), co.paralleluniverse.strands.Strand.toString(e.getValue()));
        
    }
    return map;
}