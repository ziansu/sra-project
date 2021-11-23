public boolean equal(Model_Produkt tmp) {
    if ((((this.mstrName) == (tmp.mstrName)) && ((this.mintGewicht) == (tmp.mintGewicht))) && ((this.mfltPreis) == (tmp.mfltPreis))) {
        mboolequal = true;
        return true;
    }
    mboolequal = false;
    this.mstrName = tmp.mstrName;
    this.mintGewicht = tmp.mintGewicht;
    this.mfltPreis = tmp.mfltPreis;
    return false;
}