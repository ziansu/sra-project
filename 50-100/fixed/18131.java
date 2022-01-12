public static java.lang.String handleMessage(java.lang.String message) throws java.io.IOException {
    network.Request re = network.Request.fromString(message);
    java.lang.String answer = network.GetGooglePath.getlink(re.getQuestionloc());
    re.setAnswer(answer);
    return re.toString();
}