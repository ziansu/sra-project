public java.lang.String getBackgroundColor() {
    if ((getBroken()) || ((getFailCount()) > 0))
        if ((getUnclaimedJobs().size()) == 0)
            return "orange";
        else
            return "red";
        
    else
        return "green";
    
}