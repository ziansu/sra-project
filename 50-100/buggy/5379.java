@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if (!(o instanceof leanderk.izou.wifipresence.TrackingObject))
        return false;
    
    leanderk.izou.wifipresence.TrackingObject that = ((leanderk.izou.wifipresence.TrackingObject) (o));
    return !((hostname) != null ? !(hostname.equals(that.hostname)) : (that.hostname) != null);
}