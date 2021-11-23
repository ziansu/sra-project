@java.lang.Override
public void run() {
    em.post(Events.TOGGLE_VISIBILITY_CMD, name, false, visible);
}