@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == (io.github.divayprakash.isprime.MainActivity.HINT_REQUEST)) {
        if (resultCode == (RESULT_OK)) {
            if (data != null) {
                android.widget.Toast.makeText(this, "Hint Taken!", Toast.LENGTH_SHORT).show();
                IS_HINT_TAKEN = true;
                hintButton.setEnabled(false);
                hintButton.setBackgroundColor(android.graphics.Color.parseColor("#FF616161"));
            }
        }
    }
}