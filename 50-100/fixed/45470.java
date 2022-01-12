@java.lang.Override
public void done(org.parse4j.ParseObject arg0, org.parse4j.ParseException arg1) {
    if (arg0 == null) {
        smartcity.accessibility.database.DatabaseManager.getObjectByFields("Review", m, new org.parse4j.callback.GetCallback<org.parse4j.ParseObject>() {
            @java.lang.Override
            public void done(org.parse4j.ParseObject arg0, org.parse4j.ParseException arg1) {
                if (arg0 != null)
                    o.done(arg0, null);
                else {
                    o.done(null, null);
                }
            }
        });
    }else {
    }
}