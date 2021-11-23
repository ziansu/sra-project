public void saveScreenMap() {
    try {
        java.util.Iterator it = screenStringBiMap.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = ((java.util.Map.Entry) (it.next()));
            stmt.executeQuery((((("insert into screenNameMap (screenId, screenName) values (" + (entry.getValue())) + ",'") + (entry.getKey())) + "') ON CONFLICT DO NOTHING"));
        } 
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}