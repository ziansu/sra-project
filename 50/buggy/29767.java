@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    saveScadenzeValues(dialogScadenze);
    org.greenrobot.eventbus.EventBus.getDefault().post(new simone.datecar.bus.DatiAggiornatiEvent("Aggiornati dati auto"));
}