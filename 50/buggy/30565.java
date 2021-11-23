public services.QuadPowers rollResponse(double dRoll) {
    double d = this.responseFunction(dRoll);
    return new services.QuadPowers((-d), d, d, (-d));
}