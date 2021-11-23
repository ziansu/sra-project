@java.lang.Override
public void onBackPressed() {
    ((com.themealz.themealz.TheMealzApplication) (((android.support.v7.app.AppCompatActivity) (mContext)).getApplication())).removeFromMealOptionsMap(parentID);
    super.onBackPressed();
}