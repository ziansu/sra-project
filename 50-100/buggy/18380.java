public boolean isCalling(org.spongepowered.api.entity.player.Player caller, org.spongepowered.api.entity.player.Player callee) {
    for (java.util.Map.Entry<org.apache.commons.lang3.tuple.Pair<org.spongepowered.api.entity.player.User, org.spongepowered.api.entity.player.User>, org.apache.commons.lang3.ObjectUtils.Null> entry : calls.asMap().entrySet()) {
        if ((entry.getKey().getRight().getUniqueId().equals(caller.getUniqueId())) && (entry.getKey().getLeft().getUniqueId().equals(callee.getUniqueId()))) {
            return true;
        }
    }
    return false;
}