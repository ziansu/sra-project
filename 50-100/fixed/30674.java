private void erase(float[] data, gdsc.smlm.ij.plugins.CreateData.Spot spot) {
    if ((spot.samplePositions) != null) {
        psfModel.eraseSample(data, settings.size, settings.size, spot.samplePositions);
    }else {
        psfModel.erase(data, settings.size, settings.size, spot.psf, spot.x0min, spot.x0max, spot.x1min, spot.x1max);
    }
}