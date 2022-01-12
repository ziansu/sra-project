@java.lang.Override
public android.support.v4.app.Fragment getItem(int i) {
    android.os.Bundle args = new android.os.Bundle();
    args.putInt(fragmentQuestions.QUES_NO, i);
    args.putInt(fragmentQuestions.CHAP_NO, chapterID);
    args.putInt(fragmentQuestions.SUB_NO, subjectID);
    android.support.v4.app.Fragment fragment = new com.pivot.dsa.fragmentQuestions();
    fragment.setArguments(args);
    return fragment;
}