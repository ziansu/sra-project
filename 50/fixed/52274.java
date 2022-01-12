@java.lang.Override
public void decrement(int pointValue) {
    if (((score) - pointValue) >= 0) {
        score -= pointValue;
    }else
        if (((score) - pointValue) < 0) {
            score = 0;
        }
    
}