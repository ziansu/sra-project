public static java.lang.String getAnswerUrl(java.util.ArrayList<java.lang.Long> questionIds, long minMillis) {
    java.lang.String delimitedQuestionIds = android.text.TextUtils.join(";", questionIds);
    return com.knoxpo.stackyandroid.utils.Constants.Api.BASE_URI.buildUpon().appendPath(com.knoxpo.stackyandroid.utils.Constants.Api.PATH_QUESTIONS).appendPath(delimitedQuestionIds).appendPath(com.knoxpo.stackyandroid.utils.Constants.Api.PATH_ANSWERS).appendQueryParameter(com.knoxpo.stackyandroid.utils.Constants.Api.PARAM_MIN, java.lang.String.valueOf(minMillis)).build().toString();
}