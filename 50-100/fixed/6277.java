public void activateWeapon() {
    if ((weapon) != null) {
        weapon.activateWeapon();
        if ((weapon) instanceof wizzball.objects.weapons.Pistol) {
            parent.playGunSound();
        }else
            if ((weapon) instanceof wizzball.objects.weapons.LaserPistol) {
                parent.playRaySound();
            }
        
    }
}