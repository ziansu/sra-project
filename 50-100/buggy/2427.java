@java.lang.Override
public void onHashComplete(java.lang.String hashString, java.lang.String provider, java.lang.String algorithm) {
    android.util.Log.d(LogTag.TAG, ((((("onHashComplete(): hashString= " + hashString) + ", Provider= ") + provider) + ", Algorithm= ") + algorithm));
    textViewHash.setText(hashString);
    textViewHashAlgorithm.setText(java.lang.String.format(mResources.getString(R.string.hash_algorithm), algorithm));
    textViewHashProvider.setText(java.lang.String.format(mResources.getString(R.string.hash_provider), provider));
}