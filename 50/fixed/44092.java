@java.lang.Override
public void onDone(java.lang.String rawText, java.lang.String cleanText) {
    viewModel.persistNewValue(rawText);
    adapter.notifyDataSetChanged();
    hideNumberPad();
}