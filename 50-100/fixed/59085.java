public static void main(java.lang.String[] args) {
    com.twilio.Twilio.init(Example.ACCOUNT_SID, Example.AUTH_TOKEN);
    java.util.List<java.lang.String> toBindings = java.util.Arrays.asList("{\"binding_type\":\"sms\",\"address\":\"+15555555555\"}", "{\"binding_type\":\"facebook-messenger\",\"address\":\"123456789123\"}");
    com.twilio.rest.notify.v1.service.Notification notification = com.twilio.rest.notify.v1.service.Notification.creator(Example.SERVICE_SID).setBody("Hello Bob").setToBinding(toBindings).create();
    java.lang.System.out.println(notification.getSid());
}