@java.lang.Override
public void showCar(com.automotive.hhi.mileagetracker.model.data.Car car) {
    mAverageMpg.setText(java.lang.Double.toString(car.getAvgMpg()));
    mCarName.setText(car.getName());
    mCarMake.setText(car.getMake());
    mCarModel.setText(car.getModel());
    mCarYear.setText(java.lang.Integer.toString(car.getYear()));
}