protected void coalesceSameType(java.util.List<org.eclipse.scout.rt.client.ui.basic.table.TableEvent> events) {
    for (int j = 0; j < ((events.size()) - 1); j++) {
        int i = ((events.size()) - 1) - j;
        org.eclipse.scout.rt.client.ui.basic.table.TableEvent event = events.get(i);
        int type = event.getType();
        if (isCoalesceConsecutivePrevious(type)) {
            coalesceConsecutivePrevious(event, events.subList(0, i));
        }
    }
}