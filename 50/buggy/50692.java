@java.lang.Override
public void onTextChanged(java.lang.CharSequence cs, int arg1, int arg2, int arg3) {
    adapter.getFilter().filter(cs);
}