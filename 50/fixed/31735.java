public static final void NPE(java.lang.Object... args) {
    for (java.lang.Object o : args) {
        if (null == o)
            throw new java.lang.NullPointerException();
        
    }
}