@java.lang.Override
public void startSection(int id) {
    criticalSections.add(id);
    handler.removeCallbacks(executor);
}