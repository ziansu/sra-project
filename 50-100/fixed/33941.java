private double[] computeZernike() {
    mitiv.microscopy.Zernike zernike = new mitiv.microscopy.Zernike(Nx, Ny);
    Z = zernike.zernikePupilMultipleOpt(Nzern, Nx, Ny, radius, mitiv.microscopy.MicroscopyModelPSF1D.NORMALIZED);
    return Z = mitiv.utils.MathUtils.gram_schmidt_orthonormalization(Z, Nx, Ny, Nzern);
}