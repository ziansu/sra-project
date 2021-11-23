private double[] computeZernike(int Nzern, int Nx, int Ny, double radius) {
    mitiv.microscopy.Zernike zernike = new mitiv.microscopy.Zernike(Nx, Ny);
    Z = zernike.zernikePupilMultipleOpt(Nzern, Nx, Ny, radius, mitiv.microscopy.MicroscopyModelPSF1D.NORMALIZED);
    return Z = mitiv.utils.MathUtils.gram_schmidt_orthonormalization(Z, Nx, Ny, Nzern);
}