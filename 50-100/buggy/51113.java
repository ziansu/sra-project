@java.lang.Override
public im.actor.runtime.promise.Promise<im.actor.core.entity.encryption.PeerSession> apply(im.actor.core.modules.encryption.KeyManagerActor.OwnIdentity ownIdentity, im.actor.core.modules.encryption.entity.PrivateKey ownPreKey, im.actor.core.modules.encryption.entity.UserKeys userKeys, im.actor.core.modules.encryption.entity.PublicKey theirPreKey) {
    im.actor.core.modules.encryption.entity.UserKeysGroup keysGroup = im.actor.runtime.collections.ManagedList.of(userKeys.getUserKeysGroups()).filter(im.actor.core.modules.encryption.entity.UserKeysGroup.BY_KEY_GROUP(keyGroupId)).first();
    spawnSession(uid, ownIdentity.getKeyGroup(), keyGroupId, ownIdentity.getIdentityKey(), keysGroup.getIdentityKey(), ownPreKey, theirPreKey);
    return im.actor.runtime.promise.Promise.success(null);
}