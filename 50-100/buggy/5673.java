public org.opentestsystem.rdw.reporting.exam.AssessmentItem build() {
    final org.opentestsystem.rdw.reporting.exam.AssessmentItem item = new org.opentestsystem.rdw.reporting.exam.AssessmentItem();
    item.id = id;
    item.bankItemKey = bankItemKey;
    item.claim = claim;
    item.target = target;
    item.difficultyCode = difficultyCode;
    item.maximumPoints = maximumPoints;
    item.commonCoreStandardIds = ((commonCoreStandardIds) != null) ? java.util.Collections.unmodifiableList(commonCoreStandardIds) : null;
    return item;
}