private void setResult(android.widget.ArrayAdapter<java.lang.Integer> adapter, int[] mas) {
    adapter.clear();
    for (int i = 0; i < (LENGTH); i++) {
        android.util.Log.e("log", java.lang.Integer.toString(mas[i]));
        if ((mas[i]) < 0)
            adapter.add(0);
        else
            adapter.add(mas[i]);
        
    }
}