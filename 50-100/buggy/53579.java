private void populate() {
    com.epfl.dedis.net.Identity identity = com.epfl.dedis.crypto.Utils.fromJson(mSharedPreferences.getString(com.epfl.dedis.cisc.IDENTITY, ""), com.epfl.dedis.net.Identity.class);
    mIdTextView.setText(com.epfl.dedis.crypto.Utils.encodeBase64(identity.getId()));
    mAddressTextView.setText((((identity.getCothority().getHost()) + ":") + (identity.getCothority().getPort())));
}