@java.lang.Override
protected void onConfigurationChanged(android.content.res.Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
    mCarrierLabel.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimensionPixelSize(com.android.internal.R.dimen.text_size_small_material));
    mBatteryLevel.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimensionPixelSize(R.dimen.battery_level_text_size));
    mKeyguardClock.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimensionPixelSize(com.android.internal.R.dimen.text_size_small_material));
    mKeyguardCenterClock.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimensionPixelSize(com.android.internal.R.dimen.text_size_small_material));
    mKeyguardLeftClock.setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimensionPixelSize(com.android.internal.R.dimen.text_size_small_material));
}