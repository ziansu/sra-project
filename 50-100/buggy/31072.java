@java.lang.Override
protected void onPostExecute(com.ibm.watson.developer_cloud.tone_analyzer.v3.model.ToneAnalysis analysis) {
    super.onPostExecute(analysis);
    myProgressDialog.dismiss();
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), group6.tcss450.uw.edu.tonejudge.ResultActivity.class);
    intent.putExtra("text", myText);
    intent.putExtra("analysis", analysis.getDocumentTone().toString());
    android.util.Log.d("analysis print:", analysis.getDocumentTone().toString());
    startActivity(intent);
}