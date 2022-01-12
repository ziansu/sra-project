public hudson.plugins.klaros.ResultSet[] getResultSets() {
    migratePathTestResults();
    return (resultSets) != null ? resultSets.clone() : null;
}