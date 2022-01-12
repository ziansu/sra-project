public void nextPaymentPhase() {
    switch (paymentPhase) {
        case INFO :
            show(com.niupiao.niupiao.activities.PayActivity.PaymentPhase.PAY);
            changeInternalPaymentPhase();
            break;
        case PAY :
            show(com.niupiao.niupiao.activities.PayActivity.PaymentPhase.CONFIRM);
            changeInternalPaymentPhase();
            break;
        case CONFIRM :
            show(com.niupiao.niupiao.activities.PayActivity.PaymentPhase.CONGRATS);
            changeInternalPaymentPhase();
            break;
        case CONGRATS :
            finish();
            break;
    }
}