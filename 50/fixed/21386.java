private java.io.BufferedReader openTextFile(java.lang.String name) throws java.io.IOException {
    android.content.res.AssetManager am = fragment.getActivity().getAssets();
    return new java.io.BufferedReader(new java.io.InputStreamReader(am.open(name)));
}