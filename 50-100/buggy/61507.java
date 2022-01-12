private org.sosy_lab.cpachecker.util.Pair<org.sosy_lab.cpachecker.cpa.usage.storage.UsageInfoSet, org.sosy_lab.cpachecker.cpa.usage.storage.UsageInfoSet> prepareIterationPair(org.sosy_lab.cpachecker.cpa.usage.storage.UsagePoint first, org.sosy_lab.cpachecker.cpa.usage.storage.UsagePoint second) {
    org.sosy_lab.cpachecker.cpa.usage.storage.UsageInfoSet firstUsageInfoSet = currentUsagePointSet.getUsageInfo(first);
    org.sosy_lab.cpachecker.cpa.usage.storage.UsageInfoSet secondUsageInfoSet = currentUsagePointSet.getUsageInfo(second);
    org.sosy_lab.cpachecker.cpa.usage.storage.UsageInfoSet secondSet = secondUsageInfoSet;
    if (firstUsageInfoSet == secondUsageInfoSet) {
        secondSet = secondSet.clone();
    }
    assert secondSet != null;
    return org.sosy_lab.cpachecker.util.Pair.of(firstUsageInfoSet, secondSet);
}