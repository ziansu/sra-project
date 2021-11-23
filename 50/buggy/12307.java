public void clearCallStack() {
    call_stack.clear();
    try {
        throw new java.lang.Exception("Cleared Stack!");
    } catch (java.lang.Exception Ex) {
        Ex.printStackTrace();
    }
}