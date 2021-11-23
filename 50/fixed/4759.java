@java.lang.Override
public com.kovac.rolltable.utils.builder.IncrementalRollTableBuilder<E> withIncrement(int lower, int upper, int increment) throws com.kovac.rolltable.utils.range.RangeOverlapException {
    incrementMap.addRangeValueCombo(new com.kovac.rolltable.utils.range.Range(lower, upper), increment);
    return this;
}