@java.lang.Override
public void setMaxHealth(int maxHealth) {
    try {
        if (maxHealth < 0) {
            throw new java.lang.Exception("MaxHealth must be >= 0");
        }
        if ((maxHealth % 4) != 0) {
            this.maxHealth = maxHealth - (maxHealth % 4);
            return ;
        }else {
            this.maxHealth = maxHealth;
            return ;
        }
    } catch (java.lang.Exception e) {
        java.lang.System.err.println("Max health must be >= 0");
        Gdx.app.exit();
    }
}