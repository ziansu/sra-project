public ar.edu.itba.models.ImageMatrix applyNoise(int band, ar.edu.itba.constants.NoiseType noiseType, ar.edu.itba.models.random.generators.RandomNumberGenerator generator, double percentage) {
    if (band == (-1)) {
        return this.applyAllBands(( b) -> this.applyNoise(b, noiseType, generator, percentage));
    }
    return this.applyBinaryOperation(band, noiseType.getOperator(), ar.edu.itba.models.random.RandomUtils.getNoiseBand(this.width, this.height, generator, noiseType, percentage));
}