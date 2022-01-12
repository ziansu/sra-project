public static void shutLED(int number) {
    de.adorsys.quiz.helper.GpioHelper.pin17.low();
    if (number > 1) {
        de.adorsys.quiz.helper.GpioHelper.pin18.low();
    }
    if (number > 2) {
        de.adorsys.quiz.helper.GpioHelper.pin27.low();
    }
    new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            try {
                java.lang.Thread.sleep(2000);
            } catch (java.lang.InterruptedException ex) {
            } finally {
                de.adorsys.quiz.helper.GpioHelper.restart();
            }
        }
    }).start();
}