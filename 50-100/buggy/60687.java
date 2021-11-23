private void initCarrierData() {
    if (function.variant.base.VariantManager.isUsed()) {
        function.genotype.base.CarrierBlockManager.initCarrierMap(carrierMap, this);
        if (carrierMap.isEmpty()) {
            isValid = false;
            return ;
        }
    }else {
        function.genotype.base.CarrierBlockManager.init(this);
        carrierMap = function.genotype.base.CarrierBlockManager.getVarCarrierMap(variantId);
        if ((carrierMap) == null) {
            isValid = false;
            return ;
        }
    }
}