@java.lang.Override
public boolean hasNext() {
    return ((iter.hasNext()) && (!(((train) && ((cursor) > (lowerBound))) && ((folds) == ((iteration) + 1))))) && (!((!(train)) && ((cursor) > (upperBound))));
}