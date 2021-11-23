@java.lang.Override
public void add(int value) {
    (counter)++;
    if ((counter) != (divider)) {
        sum += value;
    }else {
        notifyListeners(((int) ((sum) / (divider))));
        counter = 0;
        sum = 0;
    }
}