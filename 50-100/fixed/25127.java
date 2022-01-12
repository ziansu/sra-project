@java.lang.Override
public synchronized void setSeed(io.github.pr0methean.betterrandom.prng.@org.checkerframework.checker.initialization.qual.UnknownInitialization(value = java.util.Random.class)
CellularAutomatonRandom this, final long seed) {
    if (superConstructorFinished) {
        setSeedInternal(io.github.pr0methean.betterrandom.util.BinaryUtils.convertIntToBytes(((java.lang.Long) (seed)).hashCode()));
    }else {
        this.seed = seed;
    }
}