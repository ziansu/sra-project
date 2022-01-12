public void removeAssetFactory(java.lang.String publicKey) throws com.bitdubai.fermat_dap_api.layer.dap_middleware.dap_asset_factory.exceptions.CantDeleteAsserFactoryException {
    try {
        com.bitdubai.fermat_dap_api.layer.dap_middleware.dap_asset_factory.interfaces.AssetFactory assetFactory = getAssetFactoryByAssetPublicKey(publicKey);
        if ((assetFactory.getState()) != (com.bitdubai.fermat_dap_api.layer.all_definition.enums.State.DRAFT))
            throw new com.bitdubai.fermat_dap_api.layer.dap_middleware.dap_asset_factory.exceptions.CantDeleteAsserFactoryException(null, "Error delete Asset Factory", "Asset Factory is not DRAFT");
        else
            getAssetFactoryMiddlewareDao().removeAssetFactory(assetFactory, true);
        
    } catch (java.lang.Exception exception) {
        throw new com.bitdubai.fermat_dap_api.layer.dap_middleware.dap_asset_factory.exceptions.CantDeleteAsserFactoryException(exception, "Error delete Asset Factory", "Asset Factory - Delete");
    }
}