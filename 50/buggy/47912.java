public void deleteAction(long actionId) {
    post(com.github.eyce9000.iem.api.impl.Paths.action(actionId));
}