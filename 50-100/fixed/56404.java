@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    if ((status) == 0) {
        final android.content.Intent intent = new android.content.Intent(activity, transportapp.co600.journeyorganiserapp.ResultsActivity.class);
        intent.putExtra(activity.getString(R.string.info_xml_tag), info);
        intent.putExtra(activity.getString(R.string.results_xml_tag), results);
        activity.startActivity(intent);
    }else {
        transportapp.co600.journeyorganiserapp.ErrorDialogFragment.errorDialog(activity, "Error", status, errorMessage);
    }
}