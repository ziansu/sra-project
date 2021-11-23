@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.badlogic.gdx.backends.android.AndroidApplicationConfiguration config = new com.badlogic.gdx.backends.android.AndroidApplicationConfiguration();
    initialize(new com.alaskalinuxuser.criticalvelocity.criticalvelocity(new com.alaskalinuxuser.criticalvelocity.AndroidStringProvider()), config);
}