private com.bitdubai.fermat_api.layer.osa_android.file_system.PluginTextFile getWalletIssuerFile() throws com.bitdubai.fermat_api.CantStartPluginException {
    try {
        com.bitdubai.fermat_api.layer.osa_android.file_system.PluginTextFile walletIssuerFile = pluginFileSystem.getTextFile(pluginId, "", org.fermat.fermat_dap_plugin.layer.wallet.asset.issuer.developer.version_1.AssetIssuerWalletPluginRoot.WALLET_ISSUER_FILE_NAME, FilePrivacy.PRIVATE, FileLifeSpan.PERMANENT);
        walletIssuerFile.loadFromMedia();
        return walletIssuerFile;
    } catch (com.bitdubai.fermat_api.layer.osa_android.file_system.exceptions.FileNotFoundException | com.bitdubai.fermat_api.layer.osa_android.file_system.exceptions.CantCreateFileException e) {
        reportError(UnexpectedPluginExceptionSeverity.DISABLES_THIS_PLUGIN, e);
        return createWalletIssuerFile();
    } catch (com.bitdubai.fermat_api.layer.osa_android.file_system.exceptions.CantLoadFileException e) {
        reportError(UnexpectedPluginExceptionSeverity.DISABLES_THIS_PLUGIN, e);
        throw new com.bitdubai.fermat_api.CantStartPluginException(com.bitdubai.fermat_api.CantStartPluginException.DEFAULT_MESSAGE, e, null, null);
    }
}