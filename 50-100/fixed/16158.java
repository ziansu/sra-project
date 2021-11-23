private void callTimeoutHandler() {
    try {
        java.lang.reflect.Method m = owner.getClass().getDeclaredMethod(timeoutHandler);
        m.invoke(owner);
    } catch (java.lang.NoSuchMethodException e) {
    } catch (java.lang.IllegalAccessException e) {
        error(e.getMessage());
    } catch (java.lang.reflect.InvocationTargetException e) {
        e.printStackTrace();
    }
}