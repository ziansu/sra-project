public java.lang.Boolean isVinaphone(java.lang.String phoneNumber) {
    for (java.util.Iterator<java.lang.String> i = this._vinaphone.iterator(); i.hasNext();) {
        if ((getHeadNumber(phoneNumber)) == (i.next().toString()))
            return true;
        
    }
    return false;
}