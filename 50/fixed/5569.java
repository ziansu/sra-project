@java.lang.Override
public int calculateTotal() {
    int lower = calculateLowerPoints();
    int upper = calculateUpperPoints();
    int bonus = (upper > 63) ? 35 : 0;
    return (lower + bonus) + upper;
}