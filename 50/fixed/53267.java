public static Engine.BulletHitChecker getInstance() {
    if ((Engine.BulletHitChecker.instance) == null) {
        Engine.BulletHitChecker.instance = new Engine.BulletHitChecker();
    }
    return Engine.BulletHitChecker.instance;
}