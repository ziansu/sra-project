private void remove(java.lang.String uuid) {
    if ((get(uuid)) > 0)
        com.minegusta.mgracesredone.races.skilltree.abilities.perks.enderborn.EnderShield.shields.put(uuid, ((get(uuid)) - 1));
    
    if (contains(uuid))
        remove(uuid);
    
}