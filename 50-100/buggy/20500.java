public static void nextFrame() {
    for (int i = 0; i < (edu.virginia.engine.tweening.TweenJuggler.tweens.size()); i++) {
        edu.virginia.engine.tweening.Tween t = edu.virginia.engine.tweening.TweenJuggler.tweens.get(i);
        t.update();
        if (t.isComplete()) {
            t.dispatchEvent(new edu.virginia.engine.tweening.TweenEvent(TweenEvent.TWEEN_COMPLETE_EVENT, t));
            java.lang.System.out.println("Tween Completed");
            edu.virginia.engine.tweening.TweenJuggler.tweens.remove(i);
        }
    }
}