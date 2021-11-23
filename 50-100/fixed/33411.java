@java.lang.Override
public void commit() throws org.jevis.api.JEVisException {
    if (!(_hasChanged)) {
        return ;
    }
    if (!(org.jevis.api.sql.RelationsManagment.canWrite(_ds.getCurrentUser(), getAttribute().getObject()))) {
        throw new org.jevis.api.JEVisException("Insufficient user rights", 550);
    }
    java.util.List<org.jevis.api.JEVisSample> samples = new java.util.LinkedList<org.jevis.api.JEVisSample>();
    samples.add(this);
    getAttribute().addSamples(samples);
    _hasChanged = false;
}