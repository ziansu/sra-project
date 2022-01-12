@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    if ((message) != null) {
        outState.putString("messageDraft", message.getText().toString());
    }
    super.onSaveInstanceState(outState);
}