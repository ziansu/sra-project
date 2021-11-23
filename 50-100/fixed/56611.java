public hackattackfx.BitcoinMiner buildBitcoinMiner(hackattackfx.BitcoinMiner miner) throws hackattackfx.NotEnoughBitcoinsException {
    try {
        miner.setOnMineListener(new hackattackfx.BitcoinMiner.OnMineComplete() {
            @java.lang.Override
            public void onMine(double mineValue) {
                addBitcoins(mineValue);
            }
        });
        this.removeBitcoins(miner.getCost());
        modules.add(miner);
    } catch (hackattackfx.DuplicateListenerException ex) {
        java.lang.System.out.print(ex.toString());
    }
    return miner;
}