@java.lang.Override
public void run() {
    while (!(connection.tables.ReverseTableService.shutdown)) {
        try {
            for (connection.tables.RTableEntry e : connection.tables.ReverseTableService.reverseTable) {
                if (e.lifetime.isAfter(java.time.LocalTime.now())) {
                    connection.tables.ReverseTableService.reverseTable.remove(e);
                }
            }
        } catch (java.util.ConcurrentModificationException e) {
        }
    } 
}