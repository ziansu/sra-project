public void initialize(org.elasticsearch.script.ExecutableScript executableScript) {
    executableScript.setNextVar("_subset_freq", subsetDfHolder);
    executableScript.setNextVar("_subset_size", subsetSizeHolder);
    executableScript.setNextVar("_superset_freq", supersetDfHolder);
    executableScript.setNextVar("_superset_size", supersetSizeHolder);
    this.executableScript = executableScript;
}