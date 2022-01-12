@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    org.belchan.model.PostPK postPK = ((org.belchan.model.PostPK) (o));
    return ((id) == (postPK.id)) && ((boardid) == (postPK.boardid));
}