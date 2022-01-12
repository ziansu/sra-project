public static synchronized de.kantor.alexa.lego.ev3.iot.lambda.Alexa2Ev3IotClient getInstance(java.util.List<de.kantor.alexa.lego.ev3.iot.lambda.Ev3Device> ev3Devices) {
    if ((de.kantor.alexa.lego.ev3.iot.lambda.Alexa2Ev3IotClient.instance) == null) {
        de.kantor.alexa.lego.ev3.iot.lambda.Alexa2Ev3IotClient.instance = new de.kantor.alexa.lego.ev3.iot.lambda.Alexa2Ev3IotClient(java.lang.System.getenv("aws_iot_endpoint"), java.lang.System.getenv("aws_iot_client"), java.lang.System.getenv("aws_iot_accessKeyId"), java.lang.System.getenv("aws_iot_secretAccessKey"), ev3Devices);
    }
    return de.kantor.alexa.lego.ev3.iot.lambda.Alexa2Ev3IotClient.instance;
}