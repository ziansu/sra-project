@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    super.onPostExecute(result);
    dlg.dismiss();
    android.util.Log.e("REsulTinClassfragment", ("" + result));
    if (result.contains("true")) {
        updateTeacherLogIn(result);
    }else
        if (result.contains("false")) {
            android.widget.Toast.makeText(getActivity(), "Wrong Userkuiiuh", Toast.LENGTH_SHORT).show();
        }
    
}