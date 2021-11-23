public double getGeneralizationCost() {
    if (((lastModCount) < (modCount)) || ((generalizationCost) == 0)) {
        java.util.Arrays.fill(generalizationLevels, 0);
        generalizationLevels = getGeneralizationLevels(this, generalizationLevels);
        generalizationCost = getGC_LM(getFirst().recordContent, generalizationLevels);
        updateCluster();
    }
    return generalizationCost;
}