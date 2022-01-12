private void init() throws java.lang.Exception {
    if (isValid) {
        initCarrierData();
        function.genotype.base.DPBinBlockManager.initCarrierAndNonCarrierByDPBin(this, carrierMap, noncarrierMap);
        initGenoCovArray();
        if (checkGenoCountValid()) {
            calculateAlleleFreq();
            if (checkAlleleFreqValid()) {
                calculateGenotypeFreq();
                calculateHweP();
            }
        }
    }
}