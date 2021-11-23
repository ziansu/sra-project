@java.lang.Override
public void onClick(android.view.View v) {
    filterStr = "BEST_SELLER";
    android.widget.Toast.makeText(getActivity(), ((filterStr) + "선택됨"), Toast.LENGTH_SHORT).show();
    java.lang.String hotelurl = (url) + (filterStr);
    caller.doOkConfirmClick(hotelurl);
    dismiss();
}