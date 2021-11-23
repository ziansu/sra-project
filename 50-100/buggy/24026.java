public void nextPaymentPhase() {
    switch (paymentPhase) {
        case INFO :
            changeInternalPaymentPhase();
            show(com.niupiao.niupiao.activities.PayActivity.PaymentPhase.PAY);
            break;
        case PAY :
            changeInternalPaymentPhase();
            show(com.niupiao.niupiao.activities.PayActivity.PaymentPhase.CONFIRM);
            break;
        case CONFIRM :
            changeInternalPaymentPhase();
            show(com.niupiao.niupiao.activities.PayActivity.PaymentPhase.CONGRATS);
            break;
        case CONGRATS :
            finish();
            break;
    }
}