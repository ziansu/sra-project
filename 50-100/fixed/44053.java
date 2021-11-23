public boolean isBranchValid(java.lang.String branch) {
    if (branch == null) {
        return false;
    }else
        if ((whitelistedBrandches.isEmpty()) && (blacklistedBranches.isEmpty())) {
            return true;
        }else
            if ((whitelistedBrandches.matches(branch)) && (!(blacklistedBranches.matches(branch)))) {
                return true;
            }else {
                return false;
            }
        
    
}