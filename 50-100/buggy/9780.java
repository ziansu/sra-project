public java.lang.String toString() {
    java.lang.String res = (((lieuxDepart) + " -> ") + (lieuxArrivee)) + " ";
    if ((hDepart) != null)
        res += "Depart : " + (hDepart);
    
    if ((hArrivee) != null)
        res += "Arrivee : " + (hDepart);
    
    return res;
}