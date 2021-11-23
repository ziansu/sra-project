void init(co.airbitz.core.Account account, co.airbitz.core.Wallet wallet, java.lang.String address) {
    this.mAccount = account;
    this.mWallet = wallet;
    this.mDetails = new co.airbitz.internal.tABC_TxDetails();
    this.mMeta = new co.airbitz.core.MetadataSet();
    this.mAddress = address;
    start();
    mMeta.mChangeListener = new co.airbitz.core.MetadataSet.OnChangeListener() {
        public void onChange() {
            update();
        }
    };
    update();
}