@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if (!(mDepartment.equals("0"))) {
        switch (position) {
            case 0 :
                mGrade = "1";
                break;
            case 1 :
                mGrade = "2";
                break;
            case 2 :
                mGrade = "3";
                break;
            case 3 :
                mGrade = "4";
                break;
            default :
                mGrade = "0";
                break;
        }
    }else
        mGrade = "0";
    
}