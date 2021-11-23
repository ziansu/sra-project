public void saveScreenMap() {
    try {
        for (java.util.Map.Entry entry : screenStringBiMap.entrySet()) {
            stmt.execute((((("insert into screenNameMap (screenId, screenName) values (" + (entry.getValue())) + ",'") + (entry.getKey())) + "') ON CONFLICT DO NOTHING"));
        }
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}