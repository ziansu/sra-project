public static boolean isUserPremium(@android.support.annotation.NonNull
android.app.Application application) {
    return ((("true".equals("true")) || ((((com.benoitletondor.easybudgetapp.EasyBudget) (application)).getPremiumCheckStatus()) == (com.benoitletondor.easybudgetapp.PremiumCheckStatus.PREMIUM))) || (com.benoitletondor.easybudgetapp.helper.Parameters.getInstance(application).getBoolean(ParameterKeys.BATCH_OFFER_REDEEMED, false))) || (com.benoitletondor.easybudgetapp.helper.Parameters.getInstance(application).getBoolean(ParameterKeys.APP_TURBO_PREMIUM, false));
}