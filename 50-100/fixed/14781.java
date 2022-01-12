public void run(java.lang.Object o) {
    synchronized(variables) {
        if (o instanceof java.util.List) {
            variables[0] = ((java.util.List<java.lang.String>) (o));
            variables.notifyAll();
            return ;
        }else {
            variables[0] = new java.util.ArrayList<java.lang.String>();
            variables.notifyAll();
            return ;
        }
    }
}