private void defineActivityReturnValues(boolean correct, boolean continueOrExit) {
    android.content.Intent intent;
    intent = new android.content.Intent();
    intent.putExtra(Constants.INTENT_ANSWER_CORRECT, correct);
    intent.putExtra(Constants.INTENT_ANSWER_CONTINUE, continueOrExit);
    intent.putExtra(Constants.INTENT_ANSWER, java.lang.Integer.toString(this.mData.getmSelectedAnswer()));
    intent.putExtra(Constants.INTENT_ANSWER_QID, mData.getmQuestionID());
    mData.getActivity().setResult(Activity.RESULT_OK, intent);
}