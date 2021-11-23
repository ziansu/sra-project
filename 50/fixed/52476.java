@java.lang.Override
public void done(java.util.List<com.yahoo.beaconmessaging.model.Exhibit> exhibits, com.parse.ParseException e) {
    if (e != null) {
        addExhibits(exhibits);
    }
}