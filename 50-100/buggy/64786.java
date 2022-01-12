@java.lang.Override
public T next() {
    if ((currentFrequency) == 0) {
        int value = values.getBuckets()[nextBucket];
        currentValue = type.parse(dictionary[value]);
        currentFrequency = values.getBuckets()[((nextBucket) + 1)];
        nextBucket += 2;
    }
    (currentFrequency)--;
    return currentValue;
}