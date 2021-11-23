public void updateStats() {
    physDamage = (str) + ((1 / 4) * (acc));
    magDamage = (mag) + ((1 / 4) * (intel));
    physDR = 100 / (100 + (arm));
    magDR = 100 / (100 + (mre));
    speed = this.getEvasion();
}