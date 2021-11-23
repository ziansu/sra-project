public void updateStats() {
    physDamage = (str) + ((1 / 4) * (acc));
    java.lang.System.out.println(("Damage: " + (physDamage)));
    magDamage = (mag) + ((1 / 4) * (intel));
    physDR = 100 / (100 + (arm));
    java.lang.System.out.println(("DR: " + (physDR)));
    magDR = 100 / (100 + (mre));
    speed = this.getEvasion();
}