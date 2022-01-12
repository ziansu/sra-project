private void extractEffects(java.util.Set<info.faceland.loot.api.sockets.SocketGem> primaryHandGems, java.util.Map<info.faceland.loot.api.sockets.SocketGem.GemType, java.util.Set<info.faceland.loot.api.sockets.effects.SocketEffect>> weaponEffects) {
    for (info.faceland.loot.api.sockets.SocketGem gem : primaryHandGems) {
        java.util.Set<info.faceland.loot.api.sockets.effects.SocketEffect> existingEffects = new java.util.HashSet<>();
        if (weaponEffects.containsKey(gem.getGemType())) {
            existingEffects.addAll(weaponEffects.get(gem.getGemType()));
        }
        existingEffects.addAll(gem.getSocketEffects());
        weaponEffects.put(gem.getGemType(), existingEffects);
    }
}