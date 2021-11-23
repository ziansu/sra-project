private de.doe300.activerecord.dsl.Order.OrderType[] levelTypes(int num, de.doe300.activerecord.dsl.Order.OrderType[] types) {
    if (num == (types.length)) {
        return types;
    }
    de.doe300.activerecord.dsl.Order.OrderType[] newTypes = new de.doe300.activerecord.dsl.Order.OrderType[num];
    java.util.Arrays.fill(newTypes, de.doe300.activerecord.dsl.Order.OrderType.ASCENDING);
    java.lang.System.arraycopy(types, 0, newTypes, 0, types.length);
    return newTypes;
}