public static android.content.Intent newIntent(android.content.Context packageContext, java.lang.String question, java.lang.String answer) {
    android.content.Intent intent = new android.content.Intent(packageContext, com.example.eddiethuo.simplesignin.AnswerActivity.class);
    intent.putExtra(com.example.eddiethuo.simplesignin.AnswerActivity.EXTRA_QUESTION, question);
    intent.putExtra(com.example.eddiethuo.simplesignin.AnswerActivity.EXTRA_ANSWER, answer);
    return intent;
}