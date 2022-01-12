public static java.lang.String multipleValueRight(java.util.ArrayList<initialpkg.Storm> array, java.lang.String type, double key, int index, java.lang.String output) {
    index++;
    while (index < (array.size())) {
        if ((array.get(index).getDataDouble(type)) == key)
            output = (output + ", ") + index;
        
        index++;
    } 
    return output;
}