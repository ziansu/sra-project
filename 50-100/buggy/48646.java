public static void iphonePush(java.lang.String content, java.lang.String token, java.lang.String certificate, java.lang.String sid) {
    java.lang.System.out.println(certificate);
    edu.ut.softlab.rate.ApnsService service = edu.ut.softlab.rate.APNS.newService().withCert(certificate, edu.ut.softlab.rate.Utility.account_information.getProperty("PUSH_PWD")).withSandboxDestination().build();
    java.lang.String payload = edu.ut.softlab.rate.APNS.newPayload().customField("sid", sid).sound("default").localizedKey(content).alertTitle("subscription alert").build();
    service.push(token, payload);
}