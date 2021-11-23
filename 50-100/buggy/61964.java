private static int[] getNext(int[] polygonal) {
    int[] result = polygonal.clone();
    if ((P61_CyclicalFigurateNumbers.digitCount(polygonal)) <= 4)
        result[1] = (result[1]) + 1;
    else
        result[0] = (result[0]) - 1;
    
    return result;
}