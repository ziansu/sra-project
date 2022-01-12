public void activateWeapon() {
    if ((weapon) != null) {
        weapon.activateWeapon();
        if ((weapon) instanceof wizzball.objects.weapons.Pistol) {
            parent.playGunSound();
        }else
            if ((weapon) instanceof wizzball.objects.weapons.LaserPistol) {
                parent.playRaySound();
                try {
                    java.lang.Thread.sleep(4000);
                } catch (java.lang.InterruptedException e) {
                    e.printStackTrace();
                }
            }
        
    }
}