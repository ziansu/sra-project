public boolean isBranchValid(java.lang.String branch) {
    if (branch == null) {
        return false;
    }else
        if ((whitelistedBrandches.isEmpty()) && (blacklistedBranches.isEmpty())) {
            return true;
        }else {
            return (whitelistedBrandches.matches(branch)) && (!(blacklistedBranches.matches(branch)));
        }
    
}