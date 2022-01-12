@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.pickerview_confirm :
            if ((result) == null) {
                result = java.lang.String.valueOf(arrayWheelAdapter.getItemText(wheelView.getCurrentItem()));
            }
            callbackContext.success(result);
            android.util.Log.i(com.terrydr.pickerview.PickerView_Plugin_intent.TAG, ("result:" + (result)));
            popupWindow.dismiss();
            break;
        case R.id.pickerview_cancle :
            popupWindow.dismiss();
            break;
        default :
            break;
    }
}