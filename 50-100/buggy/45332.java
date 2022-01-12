@java.lang.Override
public void update(int index, by.ipps.atts.client.model.AcceptTest object, java.lang.String value) {
    java.lang.String key = by.ipps.atts.client.model.AcceptTest.getTestStatusMap().get(value);
    statusmap.put(object.getNpk().toString(), key);
    by.ipps.atts.client.form.cand.AcceptTestViewGrid.CandidateDB.get().refreshDisplays();
    enableSavebutton();
}