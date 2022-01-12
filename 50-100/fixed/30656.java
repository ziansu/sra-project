private EconomicValue getEconomicValueType(java.lang.String economicValueString) {
    for (int i = 0; i < (this._economicValueList.length); ++i) {
        if (this._economicValueList[i].equals(economicValueString)) {
            return EconomicValue.values()[(i + 1)];
        }
    }
    return null;
}