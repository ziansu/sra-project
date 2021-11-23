public void pauseAnimations() {
    try {
        for (com.extremecommandos.pocket_zalcoatl.utils.Animation a : animations) {
            a.wait();
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}