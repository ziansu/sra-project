@java.lang.Override
public void handleEvent(java.awt.Event event) {
    if ((event.getEventType()) == "throwKnife") {
        int ran = ((int) ((java.lang.Math.random()) * 2));
        soundEffects.playMusic(knifeSounds.get(ran));
        java.lang.System.out.println(ran);
    }
    if ((event.getEventType()) == "collision") {
        lifeCount -= 1;
        java.lang.System.out.println("damage buffer");
        java.lang.System.out.println(playerDamageBuffer);
        java.lang.System.out.println("damage timer");
        java.lang.System.out.println(playerDamageTimer);
    }
}