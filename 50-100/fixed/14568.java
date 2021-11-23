@java.lang.Override
public void onClick(android.view.View view) {
    android.util.Log.i(Constants.LOG_TAG, "onClick");
    java.lang.Integer id = view.getId();
    switch (id) {
        case R.id.btn_play :
            actionPlay();
            break;
        case R.id.btn_previous :
            actionPrevious();
            break;
        case R.id.btn_next :
            actionNext();
            break;
        case R.id.btn_favourite :
            actionFavourite();
        case R.id.btn_order :
            actionOrder();
            break;
        default :
            break;
    }
}