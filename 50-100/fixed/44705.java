public static ch.epfl.data.squall.types.Type getDominantNumericType(java.util.List<ch.epfl.data.squall.expressions.ValueExpression> veList) {
    ch.epfl.data.squall.types.Type wrapper = veList.get(0).getType();
    for (int i = 1; i < (veList.size()); i++) {
        final ch.epfl.data.squall.types.Type currentType = veList.get(i).getType();
        if (ch.epfl.data.squall.utilities.MyUtilities.isDominant(currentType, wrapper))
            wrapper = currentType;
        
    }
    return wrapper;
}