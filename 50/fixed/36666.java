public void setActorAssetUserManager(com.bitdubai.fermat_dap_api.layer.dap_actor.asset_user.interfaces.ActorAssetUserManager actorAssetUserManager) throws com.bitdubai.fermat_dap_api.layer.dap_actor.asset_user.exceptions.CantGetAssetUserActorsException {
    this.actorAssetUserManager = actorAssetUserManager;
    this.userRedemptionRedeemer.setActorAssetUserManager(actorAssetUserManager);
}