@java.lang.Override
public void decrement(int pointValue) {
    if (((score) - pointValue) <= 0) {
        score = 0;
    }else {
        score -= pointValue;
    }
}