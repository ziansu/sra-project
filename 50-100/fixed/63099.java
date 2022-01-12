public static void main(java.lang.String[] args) {
    rl.cafesourire.MainCoffeeClass mcc = new rl.cafesourire.MainCoffeeClass();
    mcc.setupMQTTClient();
    rl.cafesourire.MainCoffeeClass.socialMedia = rl.cafesourire.SocialMedia.GetSocialMedia();
    while (true) {
        try {
            java.lang.Thread.sleep(1000);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } 
}