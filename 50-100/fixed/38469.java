@java.lang.Override
public java.util.List<com.bitdubai.fermat_ccp_api.layer.wallet_module.crypto_wallet.interfaces.PaymentRequest> getMoreDataAsync(com.bitdubai.fermat_android_api.ui.enums.FermatRefreshTypes refreshType, int pos) {
    java.util.List<com.bitdubai.fermat_ccp_api.layer.wallet_module.crypto_wallet.interfaces.PaymentRequest> lstPaymentRequest = new java.util.ArrayList<com.bitdubai.fermat_ccp_api.layer.wallet_module.crypto_wallet.interfaces.PaymentRequest>();
    try {
        offset = pos;
        lstPaymentRequest = cryptoWallet.listSentPaymentRequest(walletPublicKey, blockchainNetworkType, MAX, offset);
    } catch (java.lang.Exception e) {
        appSession.getErrorManager().reportUnexpectedSubAppException(SubApps.CWP_WALLET_STORE, UnexpectedSubAppExceptionSeverity.DISABLES_SOME_FUNCTIONALITY_WITHIN_THIS_FRAGMENT, e);
        e.printStackTrace();
    }
    return lstPaymentRequest;
}