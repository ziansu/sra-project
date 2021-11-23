@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (resultCode != (android.app.Activity.RESULT_OK))
        return ;
    
    if (requestCode == (com.example.qiao.crimeaction.CrimeFragment.REQUEST_DATE)) {
        java.util.Date date = ((java.util.Date) (data.getSerializableExtra(DatePickerFragment.EXTRA_DATE)));
        mCrime.setmDate(date);
        upDate();
    }else
        if (requestCode == (com.example.qiao.crimeaction.CrimeFragment.REQUEST_PHOTO)) {
            java.io.File imagefile = new java.io.File(mCrime.getMimageLocation());
            mimageview.setImageBitmap(getBitmapwithFile(imagefile));
        }
    
}