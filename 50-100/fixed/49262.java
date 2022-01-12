public boolean empty() {
    try {
        if ((this.stackCount) <= 0) {
            return true;
        }else
            if ((this.stackData.length) > 0) {
                return false;
            }else {
                return false;
            }
        
    } catch (java.lang.NullPointerException e) {
        return true;
    }
}