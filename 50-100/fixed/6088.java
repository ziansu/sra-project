@java.lang.Override
public boolean equal(php.runtime.Memory memory) {
    switch (memory.type) {
        case INT :
            return (((php.runtime.memory.LongMemory) (memory)).value) == (value);
        case DOUBLE :
            return (((php.runtime.memory.DoubleMemory) (memory)).value) == (value);
        case STRING :
            return equal(memory.toNumeric());
        case REFERENCE :
            return equal(memory.toValue());
        default :
            return (value) == (memory.toLong());
    }
}