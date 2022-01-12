protected void applyAfterConditionLogic(com.moorkensam.xlra.dto.PriceCalculationDTO priceDTO) {
    if ((priceDTO.getAdrSurchargeMinimum().doubleValue()) > (priceDTO.getCalculatedAdrSurcharge().doubleValue())) {
        priceDTO.setResultingPriceSurcharge(priceDTO.getAdrSurchargeMinimum());
    }else {
        priceDTO.setResultingPriceSurcharge(priceDTO.getCalculatedAdrSurcharge());
    }
}