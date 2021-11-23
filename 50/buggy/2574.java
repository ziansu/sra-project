public services.QuadPowers yawResponse(double dYaw) {
    double d = this.responseFunction(dYaw);
    return new services.QuadPowers(d, (-d), d, (-d));
}