@java.lang.Override
public void onClick(android.view.View v) {
    if ((isEnteringTerm) && (!(currentToken.isZero()))) {
        isEnteringTerm = false;
        expression.push(currentToken);
        doOperation();
        currentToken = new vivu.com.undofeature.math.Token();
    }
    currentOperation = 1;
}