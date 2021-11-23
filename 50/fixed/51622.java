public long getTotalCost() {
    long total = 0;
    for (gov.nist.sip.proxy.BillingProgram.Cookie cookie : programCookies)
        if (cookie != null)
            total += cookie.getTotalCost();
        
    
    return total;
}