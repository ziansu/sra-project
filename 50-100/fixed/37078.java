private void checkGlobalLogPrefixOf(risakka.raft.miscellanea.SequentialContainer<risakka.raft.log.LogEntry> entries) {
    for (int i = 1; i <= (globalLog.size()); i++) {
        assert globalLog.get(i).equals(entries.get(i)) : "Leader Completeness property violated";
        if (!(globalLog.get(i).equals(entries.get(i)))) {
            javax.swing.JOptionPane.showMessageDialog(null, "Leader Completeness property violated", "Property violation", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
}