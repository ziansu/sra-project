@java.lang.Override
protected void onPostExecute(java.util.Date currentTime) {
    super.onPostExecute(org.sp.attendance.utils.Ntp.SntpFactory.date);
    progressDialog.dismiss();
}