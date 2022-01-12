@java.lang.Override
protected java.lang.Boolean doInBackground(java.lang.String... params) {
    com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient ddbClient = new com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient(credentialsProvider);
    com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBMapper mapper = new com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBMapper(ddbClient);
    com.peprally.jeremy.peprally.DBUserNickname userNickname = mapper.load(com.peprally.jeremy.peprally.DBUserNickname.class, params[0]);
    if (userNickname == null) {
        return false;
    }
    return true;
}