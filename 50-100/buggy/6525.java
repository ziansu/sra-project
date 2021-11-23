@java.lang.Override
public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.head_select :
            if (!(isFinishing()))
                headDialogShow(view);
            
            break;
        case R.id.profession_select :
            professionDialogShow(view);
            break;
        case R.id.title_left :
            setResult(com.gzfgeh.set.RESULT_OK);
            finish();
            break;
        default :
            break;
    }
}