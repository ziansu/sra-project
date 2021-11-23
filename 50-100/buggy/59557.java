@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    android.support.v4.app.Fragment retFragment = com.example.harsh.iiitdquora.FeedFragment.newInstance();
    switch (position) {
        case 0 :
            retFragment = com.example.harsh.iiitdquora.FeedFragment.newInstance();
            setFocusOfButtons(R.id.feedButton);
            break;
        case 1 :
            retFragment = com.example.harsh.iiitdquora.AskedFragment.newInstance();
            setFocusOfButtons(R.id.AskedButton);
            break;
        case 2 :
            retFragment = com.example.harsh.iiitdquora.AnswerFragment.newInstance();
            setFocusOfButtons(R.id.AnsweredButton);
            break;
    }
    return retFragment;
}