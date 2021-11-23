private void remove() {
    android.util.Log.d("debug", "remove called");
    str = str.substring(0, java.lang.Math.max(((str.length()) - 1), 0));
    showResult.setText(str);
    if ((str) == "")
        str = " ";
    
}