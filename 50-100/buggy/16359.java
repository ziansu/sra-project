@java.lang.Override
public boolean write(java.util.List batch) {
    if (batch == null) {
        java.lang.System.out.println("write null");
        return false;
    }
    for (java.lang.Object elem : batch) {
        java.lang.System.out.println(("write elem " + elem));
        processedElems.incrementAndGet();
        (processed)++;
        if (((processed) == 7) && (interrupt)) {
            throw new java.lang.RuntimeException("Fake writer interrupt");
        }
    }
    return true;
}