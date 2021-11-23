public void onRadioButtonClicked(android.view.View source) {
    switch (source.getId()) {
        case R.id.radioButtonDebtor :
            iAmCreditor = false;
            break;
        case R.id.radioButtonCreditor :
            iAmCreditor = true;
            break;
    }
}