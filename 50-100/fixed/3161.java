public void validateWaterRateAndDonationHeader(final org.egov.wtms.application.entity.WaterConnectionDetails waterConnectionDetails, final org.springframework.validation.BindingResult errors) {
    final org.egov.wtms.masters.entity.DonationDetails donationDetails = connectionDemandService.getDonationDetails(waterConnectionDetails);
    if (donationDetails == null)
        throw new javax.validation.ValidationException("donation.combination.required");
    
    if (waterConnectionDetails.getConnectionType().equals(ConnectionType.NON_METERED)) {
        final org.egov.wtms.masters.entity.WaterRatesDetails waterRatesDetails = connectionDemandService.getWaterRatesDetailsForDemandUpdate(waterConnectionDetails);
        if (waterRatesDetails == null)
            throw new javax.validation.ValidationException("err.water.rate.not.found");
        
    }
}