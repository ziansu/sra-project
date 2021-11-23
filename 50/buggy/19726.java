@java.lang.Override
public void end() {
    if (((graph) != null) && (shutdownFlag.getValue()))
        graph.shutdown(false);
    
}