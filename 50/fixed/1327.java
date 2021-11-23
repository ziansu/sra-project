@java.lang.Override
public void onResult(boolean isMatched) {
    if (isMatched) {
        setCardMatched();
    }else {
        setCardFaceDown(true);
    }
}