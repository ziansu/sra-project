private void changes(java.util.List<org.jasr.currentcy.domain.Sample> changes, java.util.List<org.jasr.currentcy.domain.Sample> samples, org.jasr.currentcy.domain.Currencies currency) {
    java.util.List<org.jasr.currentcy.domain.Sample> snapshots = samplerDAO.getSnapshot(currency);
    for (org.jasr.currentcy.domain.Sample sample1 : snapshots) {
        boolean result = false;
        for (org.jasr.currentcy.domain.Sample sample2 : samples) {
            result = result || (sample1.equals(sample2));
        }
        if (!result)
            changes.add(sample1);
        
    }
}