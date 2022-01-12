private void setUpToolbarTitle() {
    switch (typeOfQuestion) {
        case de.mi.ur.Constants.MULTIPLE_CHOICE :
            getSupportActionBar().setTitle(R.string.multiple_choice_button);
            break;
        case de.mi.ur.Constants.TRUE_FALSE :
            getSupportActionBar().setTitle(R.string.wrong_true_button);
            break;
        case de.mi.ur.Constants.FREETEXT :
            getSupportActionBar().setTitle(R.string.manual_entry_button);
        default :
            getSupportActionBar().setTitle(R.string.practice_main_toolbar_headline);
    }
}