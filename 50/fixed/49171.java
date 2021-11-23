@java.lang.Override
public void onClick(android.view.View v) {
    com.zatpatatm.app.Intent intent = new com.zatpatatm.app.Intent(getApplicationContext(), com.zatpatatm.app.ticket.TicketActivity.class);
    intent.putExtra("filterTicketTab", 1);
    startActivity(intent);
}