public static void main(java.lang.String[] args) {
    com.led.deep.idfa.LED_DIDFA led = new com.led.deep.idfa.LED_DIDFA();
    byte[][] D = new byte[][]{ new byte[]{ 8 , 6 , 4 , 1 } , new byte[]{ 6 , 11 , 9 , 3 } , new byte[]{ 1 , 1 , 5 , 2 } , new byte[]{ 2 , 12 , 7 , 0 } };
    led.findTnj();
}