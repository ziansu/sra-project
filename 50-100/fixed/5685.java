@java.lang.Override
public void onClick(android.view.View v) {
    male = true;
    android.util.Log.i(com.example.pingu.dhbw_project.MainActivity.TAG, "now is male");
    android.graphics.drawable.AnimationDrawable frameMan = ((android.graphics.drawable.AnimationDrawable) (startMan.getBackground()));
    buttonMan.setVisibility(View.INVISIBLE);
    frameMan.start();
}