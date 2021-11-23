private void hideToast() {
    try {
        hideMethod.invoke(mObj, new java.lang.Object[0]);
        hasReflectException = false;
    } catch (java.lang.Exception e) {
        hasReflectException = true;
        java.lang.System.out.println(e.getMessage());
    }
}