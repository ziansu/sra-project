@org.junit.Before
public void setup() {
    wallet = new org.bitcoinj.wallet.Wallet(org.bitcoinj.wallet.DefaultRiskAnalysisTest.params) {
        @java.lang.Override
        public int getLastBlockSeenHeight() {
            return 1000;
        }

        @java.lang.Override
        public long getLastBlockSeenTimeSecs() {
            return TIMESTAMP;
        }
    };
}