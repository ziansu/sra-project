@java.lang.Override
public void onActivityCreated(android.os.Bundle b) {
    if (getArguments().getBoolean(edu.cascadia.doodlebug.DrawFragment.TAKE_PHOTO))
        takePhoto();
    
    super.onActivityCreated(b);
}