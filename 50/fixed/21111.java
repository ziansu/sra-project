public boolean bestaadAl(VoorraadBeheer.Artikel check) {
    for (VoorraadBeheer.Artikel refArtikel : this) {
        if (check.equalss(refArtikel)) {
            return true;
        }
    }
    return false;
}