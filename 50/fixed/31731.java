@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    sequence.clear();
    sequence = null;
}