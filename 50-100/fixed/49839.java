@java.lang.Override
public void notifyIfMileageUpdateNecessary() {
    java.util.List<com.freak.carnetdentretien.domain.bean.Car> cars = mGetAllCarsUseCase.execute();
    for (int i = 0; i < (cars.size()); i++) {
        long lastUpdate = cars.get(i).getMileageUpdateDate();
        long today = java.lang.System.currentTimeMillis();
        if ((lastUpdate > 0) && ((today - lastUpdate) > (com.freak.carnetdentretien.app.feature.receiver.EventPresenter.ONE_WEEK_IN_MILLIS))) {
            displayNotification(cars.get(i));
        }
    }
}