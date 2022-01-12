private void saveData(int viewId, java.lang.String keyId) {
    android.widget.TextView textView = ((android.widget.TextView) (activity.findViewById(viewId)));
    java.lang.String data = textView.getText().toString().trim();
    saveSafely(activity, keyId, data);
}