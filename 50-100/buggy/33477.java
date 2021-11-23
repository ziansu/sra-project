@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    com.einzig.ipst2.util.Logger.d(((("onActivityResult(" + requestCode) + ") -> ") + resultCode));
    switch (requestCode) {
        case com.einzig.ipst2.activities.PSDetailsActivity.EDIT_ACTIVITY_CODE :
            onResultEdit(resultCode, data);
            break;
    }
}