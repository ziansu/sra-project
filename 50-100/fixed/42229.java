private void requestTotalTimeCost() {
    double reliability;
    int time;
    int cost;
    do {
        time = intInput("Please input expected execution time for this template:(s)");
        cost = intInput("Please input expected cost for this template:(￠)");
        showMessage("Given Execution Time:%d(s), Cost:%d￠, Assessing Reliability...", time, cost);
        reliability = assessReliability(time, cost);
    } while (requestUserConfirm("Reliability: %.2f%%. Reinput time and cost?", reliability) );
    setDeadline(time);
    this.costRemain = cost;
}