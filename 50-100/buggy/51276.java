@java.lang.Override
public void onClick(android.view.View v) {
    filterStr = "BEST_SELLER";
    android.widget.Toast.makeText(getActivity(), ((filterStr) + "선택됨"), Toast.LENGTH_SHORT).show();
    java.lang.String hotelurl = "/search/listings.json?q-destination=프랑스,파리&q-check-in=2017-06-09&q-check-out=2017-06-10&q-rooms=1&q-room-0-adults=2&q-room-0-children=0&sort-order=" + (filterStr);
    caller.doOkConfirmClick(hotelurl);
    dismiss();
}