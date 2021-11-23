@java.lang.Override
public void run() {
    if (java.lang.Boolean.FALSE.equals(closed.get())) {
        commit();
    }
}