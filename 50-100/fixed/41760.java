private void remove(java.lang.String uuid) {
    if ((get(uuid)) > 1) {
        com.minegusta.mgracesredone.races.skilltree.abilities.perks.enderborn.EnderShield.shields.put(uuid, ((get(uuid)) - 1));
    }else
        if (contains(uuid))
            com.minegusta.mgracesredone.races.skilltree.abilities.perks.enderborn.EnderShield.shields.remove(uuid);
        
    
}