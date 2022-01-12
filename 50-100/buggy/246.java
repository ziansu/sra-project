public double calcDispersione(int t) {
    return (((((this.coefficiente) * (this.deltaT)) * (this.superficie)) * t) / (this.spessore)) - (((((this.coeffInfissi) * (this.deltaT)) * (this.superficieInfissi)) * t) / (this.spessoreInfissi));
}