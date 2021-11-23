private void calculate() {
    this.minResponseTime = java.util.Collections.max(statisticModels, new com.afkl.cases.df.service.impl.StatisticServiceImpl.compRequestCompletionTime()).getRequestCompletionTime();
    this.maxResponseTime = java.util.Collections.min(statisticModels, new com.afkl.cases.df.service.impl.StatisticServiceImpl.compRequestCompletionTime()).getRequestCompletionTime();
    this.avgResponseTime = this.calculateAverage(this.statisticModels);
}