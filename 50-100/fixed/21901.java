private void writeDateToDB() {
    com.golubets.monitor.environment.dao.ArduinoDao arduinoDao = ((com.golubets.monitor.environment.dao.ArduinoDao) (com.golubets.monitor.environment.util.DaoApplicationContext.getInstance().getContext().getBean("arduinoDao")));
    com.golubets.monitor.environment.dao.DataDao dataDao = ((com.golubets.monitor.environment.dao.DataDao) (com.golubets.monitor.environment.util.DaoApplicationContext.getInstance().getContext().getBean("dataDao")));
    arduinoDao.persist(arduino);
    dataDao.persist(arduino, date);
}