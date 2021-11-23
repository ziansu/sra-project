@java.lang.Override
public void stopSection(int id) {
    criticalSections.remove(java.lang.Integer.valueOf(0));
    if (criticalSections.isEmpty()) {
        handler.post(executor);
    }
}