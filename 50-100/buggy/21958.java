public static java.lang.String multipleValueRight(java.util.ArrayList<initialpkg.Storm> array, java.lang.String type, char key, int index, java.lang.String output) {
    while ((index < (array.size())) && ((array.get(index).getDataChar(type)) == key)) {
        output = (output + ", ") + index;
        index++;
    } 
    return output;
}