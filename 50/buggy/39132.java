@java.lang.Override
public void onClick(android.view.View view) {
    savedInstanceState.putSerializable("SURFACE", surface);
    new edu.apsu.csci.teamaz.azpaint.DialogBoxColor(surface);
}