@java.lang.Override
protected void endPass(int n) {
    super.beginPass(n);
    if (n == (com.badlogic.gdx.tests.g3d.shadows.system.FirstPassBaseShadowSystem.FIRST_PASS))
        endPass1();
    
}