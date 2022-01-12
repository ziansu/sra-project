public void initializeControls() {
    mCardContainer = ((android.widget.FrameLayout) (mView.findViewById(R.id.mpsdkIdentificationCardContainer)));
    mCardBorder = ((android.widget.ImageView) (mView.findViewById(R.id.mpsdkCardShadowBorder)));
    mBaseIdNumberView = ((android.widget.TextView) (mView.findViewById(R.id.mpsdkIdentificationCardholderContainer)));
    mCardIdentificationNumberTextView = ((com.mercadopago.customviews.MPAutoResizeTextView) (mView.findViewById(R.id.mpsdkIdNumberView)));
    float minTextSize = android.util.TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 8, mContext.getResources().getDisplayMetrics());
    mCardIdentificationNumberTextView.setMinTextSize(minTextSize);
}