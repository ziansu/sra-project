@java.lang.Override
public void onClick(com.example.oleg.kovalik_homework2.View view) {
    if ((appOnTop[((com.example.oleg.kovalik_homework2.MainActivity.ViewHolderCell) (view.getTag())).id]) != (getResources().getString(R.string.cellName))) {
        startApp(appOnTop[((com.example.oleg.kovalik_homework2.MainActivity.ViewHolderCell) (view.getTag())).id]);
    }
}