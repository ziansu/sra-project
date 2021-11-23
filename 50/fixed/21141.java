@java.lang.Override
public void startSection(int id) {
    if (!(criticalSections.contains(id))) {
        criticalSections.add(id);
        handler.removeCallbacks(executor);
    }
}