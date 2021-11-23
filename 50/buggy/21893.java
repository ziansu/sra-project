@java.lang.Override
public void setSeed(long seed) {
    super.setSeed(seed);
    iterator = source.listIterator(((int) (seed % (source.size()))));
}