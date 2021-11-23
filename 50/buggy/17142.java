@java.lang.Override
public void process() {
    try {
        object.commit();
    } catch (java.sql.SQLException e) {
        main.java.com.djrapitops.plan.Log.toLog(this.getClass().getName(), e);
    }
}