@java.lang.Override
public int compare(org.ggp.base.util.statemachine.Move m0, org.ggp.base.util.statemachine.Move m1) {
    if (m0 == null)
        return 1;
    
    if (m1 == null)
        return -1;
    
    return m0.toString().compareTo(m1.toString());
}