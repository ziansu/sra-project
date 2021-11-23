private boolean isBiggerThan(dataStructureHW$1verSkeleton.BigInteger rhs) {
    if ((this.isPlus) && (rhs.isPlus)) {
        return this.isAbsoluteBiggerThan(rhs);
    }else
        if ((this.isPlus) && ((rhs.isPlus) == false)) {
            return true;
        }else
            if (((this.isPlus) == false) && (rhs.isPlus)) {
                return false;
            }else {
                return !(this.isAbsoluteBiggerThan(rhs));
            }
        
    
}