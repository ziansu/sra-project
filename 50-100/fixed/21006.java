@java.lang.Override
public org.apache.lucene.util.packed.STATUS inc(int index) {
    long value = values.get(index);
    value++;
    values.set(index, (value & (~((~1L) << ((values.getBitsPerValue()) - 1)))));
    return value == 1 ? STATUS.wasZero : (value >>> (values.getBitsPerValue())) != 0 ? STATUS.overflowed : STATUS.ok;
}