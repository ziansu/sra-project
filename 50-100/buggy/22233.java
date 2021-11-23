public java.util.List<com.tek.simTrade.models.Sim> displayDetails(java.lang.String country) {
    java.lang.System.out.println(("this is country: " + country));
    com.tek.simTrade.models.Sim dim = new com.tek.simTrade.models.Sim();
    dim.setCountry(country);
    com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBQueryExpression<com.tek.simTrade.models.Sim> queryExpression = new com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBQueryExpression<com.tek.simTrade.models.Sim>().withHashKeyValues(dim);
    java.util.List<com.tek.simTrade.models.Sim> lsim = mapper.query(com.tek.simTrade.models.Sim.class, queryExpression);
    return lsim;
}