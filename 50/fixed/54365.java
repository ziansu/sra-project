@java.lang.Override
protected void onPostExecute(final java.lang.Boolean success) {
    if (success) {
        java.lang.System.out.println("Remove Task succeed");
    }else {
        android.widget.Toast.makeText(getActivity(), "内部错误，您的任务将自动关闭", Toast.LENGTH_LONG).show();
        java.lang.System.out.println("Remove Task Failed!");
    }
}