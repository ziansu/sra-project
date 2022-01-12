public void activate() {
    engine.core.GameObject splash = new fizzion.tenebrae.scene.DebugSplash.Splash();
    engine.core.GameObject veil = new fizzion.tenebrae.scene.DebugSplash.Veil();
    getRootObject().addAllChildren(splash, veil);
    startTime = engine.utility.Time.getTime();
}