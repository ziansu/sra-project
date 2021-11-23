private void performAutoUpdates(java.util.List<uk.ac.manchester.cs.mekon.model.IFrame> visited) {
    if (visited.add(this)) {
        autoUpdateThis();
        for (uk.ac.manchester.cs.mekon.model.ISlot slot : referencingSlots.asList()) {
            slot.getContainer().performAutoUpdates(visited);
        }
    }
}