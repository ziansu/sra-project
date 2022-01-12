public hackattackfx.BitcoinMiner buildBitcoinMiner(hackattackfx.BitcoinMiner miner) throws hackattackfx.NotEnoughBitcoinsException {
    modules.add(miner);
    try {
        miner.setOnMineListener(new hackattackfx.BitcoinMiner.OnMineComplete() {
            @java.lang.Override
            public void onMine(double mineValue) {
                addBitcoins(mineValue);
            }
        });
        this.removeBitcoins(miner.getCost());
    } catch (hackattackfx.DuplicateListenerException ex) {
        java.lang.System.out.print(ex.toString());
    }
    return miner;
}