public boolean empty() {
    try {
        if ((this.stackData.length) > 0) {
            return false;
        }else
            if ((this.stackCount) <= 0) {
                return true;
            }else {
                return false;
            }
        
    } catch (java.lang.NullPointerException e) {
        return true;
    }
}