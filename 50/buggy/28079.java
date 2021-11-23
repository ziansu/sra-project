public static org.deidentifier.arx.AttributeType.MicroAggregationFunction createGeneralization(boolean ignoreMissingData) {
    return new org.deidentifier.arx.AttributeType.MicroAggregationFunction(new org.deidentifier.arx.framework.check.distribution.DistributionAggregateFunction.DistributionAggregateFunctionGeneralization(ignoreMissingData), false, DataScale.NOMINAL, "Generalization");
}