public static synchronized de.kantor.alexa.lego.ev3.iot.lambda.Alexa2Ev3DynamoDBClient getInstance() {
    if ((de.kantor.alexa.lego.ev3.iot.lambda.Alexa2Ev3DynamoDBClient.instance) == null) {
        de.kantor.alexa.lego.ev3.iot.lambda.Alexa2Ev3DynamoDBClient.instance = new de.kantor.alexa.lego.ev3.iot.lambda.Alexa2Ev3DynamoDBClient(java.lang.System.getenv("aws_iot_endpoint"), java.lang.System.getenv("aws_iot_client"), java.lang.System.getenv("aws_iot_accessKeyId"), java.lang.System.getenv("aws_iot_secretAccessKey"));
    }
    return de.kantor.alexa.lego.ev3.iot.lambda.Alexa2Ev3DynamoDBClient.instance;
}