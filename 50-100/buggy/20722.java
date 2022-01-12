@java.lang.Override
protected void validateExpression() throws java.lang.IllegalArgumentException {
    org.eclipse.smarthome.core.scheduler.CronExpression.DayOfMonthExpressionPart domPart = ((org.eclipse.smarthome.core.scheduler.CronExpression.DayOfMonthExpressionPart) (this.getExpressionPart(org.eclipse.smarthome.core.scheduler.CronExpression.DayOfMonthExpressionPart.class)));
    org.eclipse.smarthome.core.scheduler.CronExpression.DayOfWeekExpressionPart dowPart = ((org.eclipse.smarthome.core.scheduler.CronExpression.DayOfWeekExpressionPart) (this.getExpressionPart(org.eclipse.smarthome.core.scheduler.CronExpression.DayOfWeekExpressionPart.class)));
    if ((!(domPart.isNotSpecific())) && (!(dowPart.isNotSpecific()))) {
        throw new java.lang.IllegalArgumentException("The DayOfMonth and DayOfWeek rule parts CAN NOT be not specific at the same time.");
    }
}