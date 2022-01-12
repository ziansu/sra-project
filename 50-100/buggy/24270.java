@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if (position == ((MyData.displayPaymentList.size()) - 1)) {
        android.widget.Toast.makeText(getActivity(), "This item cannot be deleted or edited", Toast.LENGTH_LONG).show();
        return true;
    }
    MyData.selectPaymentItemIndex = position;
    MyData.selectedPaymentItem = MyData.allMyPaymentItems.get(position);
    MyData.editPaymentItem = MyData.allMyPaymentItems.get(position);
    startActivity(new android.content.Intent(getActivity(), com.example.lj.paymentmanagement.EditOrDeletePaymentActivity.class));
    return true;
}