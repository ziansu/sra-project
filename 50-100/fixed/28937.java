private java.lang.String generateText(int length, char[] dictionary) {
    java.lang.String txt = "";
    for (int i = 0; i < length; i++) {
        txt += dictionary[ml.miron.captcha.image.producer.DefaultTextProducer.RANDOM.nextInt(dictionary.length)];
    }
    return txt;
}