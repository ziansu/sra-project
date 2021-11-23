@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.badlogic.gdx.backends.android.AndroidApplicationConfiguration config = new com.badlogic.gdx.backends.android.AndroidApplicationConfiguration();
    java.lang.String version;
    try {
        version = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
    } catch (android.content.pm.PackageManager e) {
        version = "???";
    }
    initialize(new com.watabou.pixeldungeon.PixelDungeon(new com.watabou.utils.PDPlatformSupport<com.watabou.pixeldungeon.input.GameAction>(version, "Documents/pixeldungeon.cn/saves/", new com.watabou.pd.android.AndroidInputProcessor())), config);
}