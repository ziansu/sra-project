@java.lang.Override
public int executeStrategy(int number) {
    int newNumber = number;
    int rest = number % (properties.getDivisionReference());
    if (rest == 1) {
        newNumber--;
    }else
        if (rest == 2) {
            newNumber++;
        }
    
    newNumber /= properties.getDivisionReference();
    return newNumber;
}