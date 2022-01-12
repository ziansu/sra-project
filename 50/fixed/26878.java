@java.lang.Override
protected void onPostExecute(java.util.Date currentTime) {
    progressDialog.dismiss();
    super.onPostExecute(org.sp.attendance.utils.Ntp.SntpFactory.date);
}