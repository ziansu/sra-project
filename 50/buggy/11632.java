@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.btn_addcompany :
            addCompany();
            break;
        case R.id.btn_add_category :
            addCategory(v);
            break;
    }
}