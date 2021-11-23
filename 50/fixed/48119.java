@java.lang.Override
public void run() {
    es.usc.citius.servando.calendula.DefaultDataGenerator.fillDBWithDummyData(getApplicationContext());
    es.usc.citius.servando.calendula.scheduling.DailyAgenda.instance().setupForToday(this);
    setupUpdateDailyAgendaAlarm();
}