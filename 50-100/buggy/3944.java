@java.lang.Override
public void run() {
    while (!(com.jsl.babytrader.Data.SharedData.isEnded())) {
        if (!(isPaused())) {
            sleep(getWaitTime(com.jsl.babytrader.Runnables.PromotionTeam.SLEEP_TIME_MIN, com.jsl.babytrader.Runnables.PromotionTeam.SLEEP_TIME_MAX, com.jsl.babytrader.Controls.Configuration.getLevelPromotion()));
            Gdx.app.postRunnable(new java.lang.Runnable() {
                @java.lang.Override
                public void run() {
                    com.jsl.babytrader.Runnables.PromotionTeam.addCustomer(true);
                    com.jsl.babytrader.Runnables.PromotionTeam.addCustomer(false);
                }
            });
        }
    } 
}