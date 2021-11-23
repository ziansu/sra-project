@java.lang.Override
public void run(final org.eclipse.core.runtime.IProgressMonitor monitor) throws java.lang.InterruptedException, java.lang.reflect.InvocationTargetException {
    java.sql.Connection conn = null;
    try {
        conn = net.tourbook.database.TourDatabase.getInstance().getConnection();
        net.tourbook.database.TourDatabase.updateTourWeek(conn, monitor, _backupFirstDayOfWeek, _backupMinimalDaysInFirstWeek);
    } catch (final java.sql.SQLException e) {
        net.tourbook.ui.UI.showSQLException(e);
    } finally {
        if (conn != null) {
            try {
                conn.close();
            } catch (final java.sql.SQLException e) {
                net.tourbook.ui.UI.showSQLException(e);
            }
        }
    }
}