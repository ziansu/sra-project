public static void main(java.lang.String[] args) {
    java.lang.System.out.println("Hello world!");
    org.zalgosircular.extempfiller2.research.Topic t = new org.zalgosircular.extempfiller2.research.Topic("my topeka");
    org.zalgosircular.extempfiller2.messaging.InMessage m = new org.zalgosircular.extempfiller2.messaging.InMessage(InMessage.Type.DELETE, t);
    java.lang.System.out.println(m.toString());
}