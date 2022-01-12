private static void loadEntryBookWithSampleDeletedEntries(seedu.multitasky.model.EntryBook entryBook) {
    for (seedu.multitasky.model.entry.Entry entry : seedu.multitasky.testutil.SampleEntries.getSampleDeletedEntries()) {
        try {
            entryBook.addEntry(seedu.multitasky.model.util.EntryBuilder.build(entry));
        } catch (seedu.multitasky.model.entry.exceptions.OverlappingEventException oee) {
        } catch (seedu.multitasky.model.entry.exceptions.OverlappingAndOverdueEventException e) {
        } catch (seedu.multitasky.model.entry.exceptions.EntryOverdueException e) {
        } catch (seedu.multitasky.model.entry.exceptions.DuplicateEntryException e) {
            assert false : "Sample entries cannot have duplicate entries.";
        }
    }
}