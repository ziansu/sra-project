private WeaponType pickToGun(Pickup p) {
    if (p == null) {
        return null;
    }
    PickupType pt = p.getPickupType();
    switch (pt) {
        case WEAPON_LASER_RIFLE :
            return WeaponType.LASER_RIFLE;
        case WEAPON_MINI_BLASTER :
            return WeaponType.MINI_BLASTER;
        case WEAPON_SCATTER_GUN :
            return WeaponType.SCATTER_GUN;
        case WEAPON_RAIL_GUN :
            return WeaponType.RAIL_GUN;
        default :
            return null;
    }
}