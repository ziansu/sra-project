private void setupContent() {
    com.squareup.picasso.Picasso.with(getApplicationContext()).load(mProduct.getUrl()).placeholder(R.drawable.im_placeholder).into(ivProductDetailImage);
    tvProductDetailName.setText(mProduct.getName());
    tvProductDetailOrigin.setText(mUser.getAddress_user());
    tvProductDetailPrice.setText(java.lang.String.valueOf(mProduct.getPrices()));
    tvFullName.setText(mUser.getFullname());
}