@java.lang.Override
public void run() {
    try {
        channel.basicConsume(endPointName, true, ((com.daef.tinggodrabbitmqbank.Consumer) (this)));
    } catch (java.io.IOException ex) {
        java.lang.System.out.println(("EX:" + (ex.getLocalizedMessage())));
    }
}