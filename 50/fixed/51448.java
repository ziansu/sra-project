public java.lang.String getKeyValPair(int partition) {
    return (((partition + ",") + (curKey)) + ",") + (curVal);
}