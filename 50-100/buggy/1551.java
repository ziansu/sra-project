private java.lang.String getEnForceCoverageStatus(java.lang.Double coveragePercent) {
    java.lang.String status = null;
    if (coveragePercent < 75) {
        status = "Danger";
    }else
        if (coveragePercent < 80) {
            status = "Risk";
        }else
            if (coveragePercent < 75) {
                status = "Danger";
            }else
                if (coveragePercent < 95) {
                    status = "Acceptable";
                }else {
                    status = "Safe";
                }
            
        
    
    return status;
}