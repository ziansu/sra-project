@java.lang.Override
public boolean equals(java.lang.Object otherStylist) {
    if (!(otherStylist instanceof Stylist)) {
        return false;
    }else {
        Stylist newStylist = ((Stylist) (otherStylist));
        return (this.getName().equals(newStylist.getName())) && ((this.getId()) == (newStylist.getId()));
    }
}