@java.lang.Override
public void onHashComplete(java.lang.String hashString, java.lang.String provider, java.lang.String algorithm) {
    android.util.Log.d(LogTag.TAG, ((((("onHashComplete(): hashString= " + hashString) + ", Provider= ") + provider) + ", Algorithm= ") + algorithm));
    setText(textViewHash, hashString);
    setText(textViewHashAlgorithm, R.string.hash_algorithm, algorithm);
    setText(textViewHashProvider, R.string.hash_provider, provider);
}