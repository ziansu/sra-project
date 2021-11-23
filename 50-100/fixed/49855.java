public void moveAtPower(int power) {
    logger.info(("moveAtPower: " + power));
    this.interrupt = true;
    if (power == 0)
        return ;
    
    final int powerFinal = power;
    new java.lang.Thread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            pwm(powerFinal);
        }
    }).start();
}