public void decrementHealth(int value) {
    int realHealthDamage = mShield.decStrength((((realHealth) + (mShield.getStrength())) - value));
    if (realHealthDamage != 0) {
        realHealth -= realHealthDamage;
        com.taserlag.lasertag.activity.FPSActivity.updateHealthText();
    }
}