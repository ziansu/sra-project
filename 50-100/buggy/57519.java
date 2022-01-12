@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    donutProgress.setVisibility(View.GONE);
    try {
        if ((com.marknguyen.babygenderpredictor.PickDayActivity.checkBoyorGirl(lunarBirthday.lunarYear, lunarPregnat.lunarYear, lunarPregnat.lunarMonth)) == 0) {
            iv_boyorgirl.setImageResource(R.drawable.girl1);
            iv_boyorgirl.setVisibility(View.VISIBLE);
        }else {
            iv_boyorgirl.setImageResource(R.drawable.boy1);
            iv_boyorgirl.setVisibility(View.VISIBLE);
        }
    } catch (java.lang.Exception e) {
        android.widget.Toast.makeText(getBaseContext(), "Please enter input exactly!", Toast.LENGTH_SHORT).show();
    }
}