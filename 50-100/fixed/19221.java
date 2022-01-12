private static java.lang.String getSupplicantStateString(final android.net.wifi.SupplicantState sstate) {
    if (sstate.equals(SupplicantState.COMPLETED))
        return org.wahtod.wififixer.WFConnection.CONNECTED;
    else
        if (sstate.equals(SupplicantState.DORMANT))
            return org.wahtod.wififixer.WFConnection.SLEEPING;
        else
            if (android.net.wifi.SupplicantState.isValidState(sstate))
                return sstate.name();
            else
                return org.wahtod.wififixer.WFConnection.INVALID;
            
        
    
}