public Person retrieve() {
    int iterator = (array.length) - 1;
    while ((iterator > 0) && ((array[iterator]) == null)) {
        iterator--;
    } 
    Person retrieved = array[iterator];
    array[iterator] = null;
    return retrieved;
}