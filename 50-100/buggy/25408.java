public double getMaxPoints() {
    double max = 0;
    for (model.roster.GradedItem item : assignments) {
        if ((!(item.isExtraCredit())) && (!(item.hasChildren()))) {
            max += item.maxScore();
        }
    }
    return max;
}