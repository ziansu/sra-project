@java.lang.Override
public void onBackPressed() {
    if (doubleBackToExitPressedOnce) {
        super.onBackPressed();
        return ;
    }
    android.widget.Toast.makeText(this, "এখান থেকে বের হতে চাইলে আরেকবার চাপ দিন ", Toast.LENGTH_LONG).show();
    this.doubleBackToExitPressedOnce = true;
    demo.kolorob.kolorobdemoversion.activity.PlaceDetailsActivityNewLayout.currentCategoryID = 0;
}