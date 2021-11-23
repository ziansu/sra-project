@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int id) {
    com.igorko.accesibleif.manager.CityStorage cityStorage = com.igorko.accesibleif.manager.CityStorage.getInstance();
    com.igorko.accesibleif.models.City selectedCity = cityStorage.getCityById(com.igorko.accesibleif.utils.DialogUtils.mSelectedCityId);
    com.igorko.accesibleif.manager.CityManager cityManager = new com.igorko.accesibleif.manager.CityManager();
    cityManager.setCurrentCity(selectedCity);
    com.igorko.accesibleif.manager.PreferencesManager.getInstance().setAppFirstStart();
    ((com.igorko.accesibleif.activity.MainActivity) (activity)).moveToCenterCity(null, true);
    ((com.igorko.accesibleif.activity.MainActivity) (activity)).getData(Const.BuildingsType.ALL);
}