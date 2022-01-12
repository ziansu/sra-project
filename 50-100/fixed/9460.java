@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    switch (requestCode) {
        case 10 :
            if ((resultCode == (android.app.Activity.RESULT_OK)) && (data != null)) {
                java.util.ArrayList<java.lang.String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                commandText.setText(result.get(0));
                new mohz.m13.wicompanion.CommandFragment.SendText().execute(result.get(0));
            }
            break;
    }
}