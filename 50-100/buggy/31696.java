public void initialize(org.elasticsearch.script.ExecutableScript executableScript) {
    this.executableScript = executableScript;
    this.executableScript.setNextVar("_subset_freq", subsetDfHolder);
    this.executableScript.setNextVar("_subset_size", subsetSizeHolder);
    this.executableScript.setNextVar("_superset_freq", supersetDfHolder);
    this.executableScript.setNextVar("_superset_size", supersetSizeHolder);
}