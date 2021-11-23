@java.lang.Override
public void run() {
    java.lang.System.out.println("inside run");
    try {
        java.lang.System.out.println("consume");
        channel.basicConsume(endPointName, true, ((com.daef.tinggodrabbitmqbank.Consumer) (this)));
    } catch (java.io.IOException ex) {
        java.lang.System.out.println(("EX:" + (ex.getLocalizedMessage())));
    }
}