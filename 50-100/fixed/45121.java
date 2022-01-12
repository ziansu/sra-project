@java.lang.Override
public boolean validRoll() {
    int sum = 0;
    for (int i = 0; i < (results.length); i++) {
        if ((results[i]) >= 4) {
            for (Dice d : dice) {
                sum += d.getFaceValue();
            }
            myTextField.setText(java.lang.String.valueOf(sum));
            break;
        }else {
            myTextField.setText(java.lang.String.valueOf("0"));
        }
    }
    return true;
}