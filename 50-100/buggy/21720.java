@java.lang.Override
public boolean equals(java.lang.Object o) {
    if (o == (this)) {
        return true;
    }else
        if ((o == null) || (!(o instanceof domain.speler.Speler))) {
            return false;
        }else {
            domain.speler.Speler s = ((domain.speler.Speler) (o));
            return ((this.naam) == (s.naam)) && ((this.score) == (s.score));
        }
    
}