@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    android.support.v4.app.Fragment retFragment = com.example.harsh.iiitdquora.FeedFragment.newInstance();
    switch (position) {
        case 0 :
            retFragment = com.example.harsh.iiitdquora.FeedFragment.newInstance();
            break;
        case 1 :
            retFragment = com.example.harsh.iiitdquora.AskedFragment.newInstance();
            break;
        case 2 :
            retFragment = com.example.harsh.iiitdquora.AnswerFragment.newInstance();
            break;
    }
    return retFragment;
}