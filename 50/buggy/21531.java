@java.lang.Override
public void onResponse(retrofit.Response<com.fatel.mamtv1.Model.StatusDescription> response, retrofit.Retrofit retrofit) {
    android.widget.Toast.makeText(getApplicationContext(), "อัปเดตข้อมูลไปยังเซิร์ฟเวอร์สำเร็จ", Toast.LENGTH_SHORT).show();
}