private double calcPartnerWeight(eu.eexcess.dataformats.result.ResultList resultList, eu.eexcess.dataformats.userprofile.SecureUserProfile secureUserProfile) {
    double partnerWeight = 0.0;
    for (eu.eexcess.dataformats.result.Result result : resultList.results) {
        partnerWeight += calcResultWeight(result, secureUserProfile);
    }
    if (resultList.results.isEmpty())
        return partnerWeight / (resultList.results.size());
    else
        return 0.0;
    
}