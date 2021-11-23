@java.lang.Override
protected void onPostExecute(cpe.top.quizz.beans.ReturnObject result) {
    delegate.processFinish(result);
}