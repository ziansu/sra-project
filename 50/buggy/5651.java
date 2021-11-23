@java.lang.Override
protected void populateView(android.view.View view, com.speedyfirecyclone.cardstore.Cardstructure card, int position) {
    android.widget.TextView listCardname = ((android.widget.TextView) (view.findViewById(R.id.listCardnameCardlistAdapter)));
    listCardname.setText(" ");
    listCardname.setText(card.getCardTitle());
}