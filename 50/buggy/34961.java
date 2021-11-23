@java.lang.Override
public void onClick(android.view.View view) {
    startCreateJournalEntryActivity(view, journalId, journalName);
    android.widget.Toast.makeText(this, ("Add to: " + journalId), Toast.LENGTH_SHORT).show();
}