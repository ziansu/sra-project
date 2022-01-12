@java.lang.Override
public java.lang.Void doInBackground(java.lang.String... params) {
    com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient ddbClient = new com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient(credentialsProvider);
    com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBMapper mapper = new com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBMapper(ddbClient);
    com.csulb.decisionator.decisionator.User user = mapper.load(com.csulb.decisionator.decisionator.User.class, params[0]);
    if ((user.getAchievements()) != null) {
        achieveString = user.getAchievements().split(",");
    }else {
        java.lang.String[] temp = new java.lang.String[1];
        temp[0] = "0";
        achieveString = temp;
    }
    return null;
}