public java.lang.String getRandomVorname() {
    int zahl = 0;
    zahl = this.rnd.nextInt(19);
    return this.vornamearray[zahl];
}