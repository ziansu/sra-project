private void initializeActivity(@android.support.annotation.Nullable
final android.os.Bundle savedInstanceState) {
    if (savedInstanceState == null) {
        this.mStripeNum = getIntent().getLongExtra(com.jorge.boats.view.stripe.StripeActivity.INTENT_EXTRA_PARAM_STRING_ID, DomainStripe.STRIPE_NUM_CURRENT);
        initializeStripePresenter();
    }else {
        this.mStripeNum = savedInstanceState.getLong(com.jorge.boats.view.stripe.StripeActivity.INSTANCE_STATE_PARAM_STRING_ID, DomainStripe.STRIPE_NUM_CURRENT);
    }
}