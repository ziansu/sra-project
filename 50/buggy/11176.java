@java.lang.Override
public void onClick(android.view.View v) {
    if (!(mTele.isShown())) {
        mTeleField.setVisibility(View.VISIBLE);
    }else {
        mTeleField.setVisibility(View.GONE);
    }
}