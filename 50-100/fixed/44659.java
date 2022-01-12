@java.lang.SuppressWarnings(value = "unused")
protected boolean transitionAndSaveASM(final spark.Response the_response) {
    if (((us.freeandfair.corla.endpoint.AbstractEndpoint.DISABLE_ASM) || ((my_asm) == null)) || ((endpointEvent()) == null)) {
        return true;
    }
    try {
        my_asm.stepEvent(endpointEvent());
    } catch (final java.lang.IllegalStateException e) {
        illegalTransition(the_response, e.getMessage());
        return false;
    }
    return us.freeandfair.corla.asm.ASMUtilities.save(my_asm);
}