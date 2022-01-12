private org.sosy_lab.cpachecker.util.Pair<org.sosy_lab.cpachecker.cpa.usage.storage.UsageInfoSet, org.sosy_lab.cpachecker.cpa.usage.storage.UsageInfoSet> prepareIterationPair(org.sosy_lab.cpachecker.cpa.usage.storage.UsagePoint first, org.sosy_lab.cpachecker.cpa.usage.storage.UsagePoint second) {
    org.sosy_lab.cpachecker.cpa.usage.storage.UsageInfoSet firstUsageInfoSet = currentUsagePointSet.getUsageInfo(first);
    org.sosy_lab.cpachecker.cpa.usage.storage.UsageInfoSet secondUsageInfoSet = currentUsagePointSet.getUsageInfo(second);
    if (firstUsageInfoSet == secondUsageInfoSet) {
        secondUsageInfoSet = secondUsageInfoSet.clone();
    }
    assert secondUsageInfoSet != null;
    return org.sosy_lab.cpachecker.util.Pair.of(firstUsageInfoSet, secondUsageInfoSet);
}