private int indexOf(metro.TrainManagement.Trains.TrainLine[] array, metro.TrainManagement.Trains.TrainLine element) {
    int counter = 0;
    for (int i = 0; (i < (array.length)) && ((array[i]) != null); ++i) {
        if (array[i].equals(element))
            return counter;
        
        if ((array[i]) != null)
            ++counter;
        
    }
    return -1;
}