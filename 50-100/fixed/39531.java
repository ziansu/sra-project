private void pressOperator(com.example.android_calculater.MainActivity.OPERATOR op) {
    if (!(flag_OperatorPressed)) {
        mNum1 = java.lang.Float.parseFloat(mStrResult.toString());
        mOperator = op;
        flag_NumberPressed = false;
    }else
        if (flag_NumberPressed) {
            mNum2 = java.lang.Float.parseFloat(mStrResult.toString());
            calculate(mOperator);
            mOperator = op;
            flag_NumberPressed = false;
        }else {
            mOperator = op;
        }
    
    flag_OperatorPressed = true;
    flag_EqualPressed = false;
}