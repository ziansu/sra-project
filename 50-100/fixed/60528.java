public boolean isVinaphone(java.lang.String phoneNumber) {
    for (java.util.Iterator<java.lang.String> i = this._vinaphone.iterator(); i.hasNext();) {
        if (getHeadNumber(phoneNumber).equals(i.next()))
            return true;
        
    }
    return false;
}