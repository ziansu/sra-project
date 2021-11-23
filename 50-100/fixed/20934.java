@java.lang.Override
public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.fab_plus :
            if (isExpanded) {
                CollapseFabs();
            }else {
                ExpandFabs();
            }
            break;
        case R.id.fab_create_group :
            CollapseFabs();
            Utils.FirebaseUtil.CheckAuthForActionCode(this, novitskyvitaly.geogroupproject.MainActivity.ACTION_CODE_FOR_CREATE_GROUP, this);
            break;
        case R.id.fab_join_group :
            CollapseFabs();
            Utils.FirebaseUtil.CheckAuthForActionCode(this, novitskyvitaly.geogroupproject.MainActivity.ACTION_CODE_FOR_JOIN_GROUP, this);
            break;
    }
}