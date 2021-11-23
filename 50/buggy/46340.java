public services.QuadPowers pitchResponse(double dPitch) {
    double d = this.responseFunction(dPitch);
    return new services.QuadPowers((-d), (-d), d, d);
}