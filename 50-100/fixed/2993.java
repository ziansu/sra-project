public org.egov.works.models.masters.SORRate getRateOn(final java.util.Date estimateDate) {
    if (estimateDate == null)
        throw new org.egov.infra.exception.ApplicationRuntimeException("no.rate.for.date");
    
    for (final org.egov.works.models.masters.SORRate rate : sorRates)
        if ((rate != null) && (isWithin(rate.getValidity(), estimateDate)))
            return rate;
        
    
    throw new org.egov.infra.exception.ApplicationRuntimeException("no.rate.for.date");
}