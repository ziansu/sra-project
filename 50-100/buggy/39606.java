public void setLed(int led, int r, int g, int b) {
    if (led == (-1)) {
        return ;
    }
    try {
        java.lang.System.out.println(("Set the led with " + r));
        out.write((((((((("1|" + led) + "|") + r) + "|") + g) + "|") + b) + "\n"));
        out.flush();
    } catch (java.lang.Exception err) {
        err.printStackTrace();
    }
}