@java.lang.Override
protected void onPostExecute(java.util.List<cpe.top.quizz.beans.ReturnObject> result) {
    delegate.processFinish(result);
}