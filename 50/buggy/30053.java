@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    outState.putString("messageDraft", message.getText().toString());
    super.onSaveInstanceState(outState);
}