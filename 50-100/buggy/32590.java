public void persistDigitalAssetMetadataInLocalStorage(com.bitdubai.fermat_dap_api.layer.all_definition.digital_asset.DigitalAssetMetadata digitalAssetMetadata, java.lang.String internalId) throws com.bitdubai.fermat_dap_api.layer.dap_transaction.common.exceptions.CantCreateDigitalAssetFileException {
    com.bitdubai.fermat_dap_api.layer.all_definition.digital_asset.DigitalAsset digitalAsset = digitalAssetMetadata.getDigitalAsset();
    try {
        java.lang.String digitalAssetInnerXML = digitalAsset.toString();
        persistXMLStringInLocalStorage(digitalAssetInnerXML, digitalAssetFileName, digitalAssetMetadata.getDigitalAsset().getPublicKey());
        java.lang.String digitalAssetMetadataInnerXML = digitalAssetMetadata.toString();
        persistXMLStringInLocalStorage(digitalAssetMetadataInnerXML, digitalAssetMetadataFileName, internalId);
    } catch (com.bitdubai.fermat_api.layer.osa_android.file_system.exceptions.CantPersistFileException | com.bitdubai.fermat_api.layer.osa_android.file_system.exceptions.CantCreateFileException exception) {
        throw new com.bitdubai.fermat_dap_api.layer.dap_transaction.common.exceptions.CantCreateDigitalAssetFileException(exception, "Persisting the digital asset objects in local storage", "Cannot create or persist the file");
    }
}