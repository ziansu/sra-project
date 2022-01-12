public boolean equals(java.lang.String metricName, java.lang.String queueName, int periodicity, int queueCapacity) {
    return (((this.metricName.equals(metricName)) && (this.queueName.equals(queueName))) && ((this.periodicity) == periodicity)) && ((this.queueCapacity) == queueCapacity);
}