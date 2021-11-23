public void onSuccess(edu.pdx.cs410J.AbstractPhoneBill phonebill) {
    edu.pdx.cs410J.eschott.client.PhoneBill bill = ((edu.pdx.cs410J.eschott.client.PhoneBill) (phonebill));
    com.google.gwt.user.cellview.client.CellTable<edu.pdx.cs410J.eschott.client.PhoneCall> table = prettyPrint(phonebill);
    edu.pdx.cs410J.eschott.client.Label label = new edu.pdx.cs410J.eschott.client.Label(("Displaying phone bill for: " + (bill.getCustomer())));
    edu.pdx.cs410J.eschott.client.RootPanel.get().add(label);
    deck.add(table);
    deck.showWidget(deck.getWidgetIndex(table));
}