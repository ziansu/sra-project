public static java.lang.String multipleValueRight(java.util.ArrayList<initialpkg.Storm> array, java.lang.String type, java.lang.String key, int index, java.lang.String output) {
    while ((index < (array.size())) && (array.get(index).getDataString(type).equals(key))) {
        output = (output + ", ") + index;
        index++;
    } 
    return output;
}