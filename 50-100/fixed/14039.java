public void onSuccess(edu.pdx.cs410J.AbstractPhoneBill phonebill) {
    edu.pdx.cs410J.eschott.client.PhoneBill bill = ((edu.pdx.cs410J.eschott.client.PhoneBill) (phonebill));
    com.google.gwt.user.cellview.client.CellTable<edu.pdx.cs410J.eschott.client.PhoneCall> table = prettyPrint(phonebill);
    deck.add(table);
    deck.showWidget(deck.getWidgetIndex(table));
}