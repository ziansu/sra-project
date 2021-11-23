@java.lang.Override
public void saveCarInfo(com.jlfex.hermes.model.UserCar userCar) {
    java.util.Date curDate = new java.util.Date();
    userCar.setStatus(com.jlfex.hermes.model.UserCar.Status.VALID);
    userCarRepository.save(userCar);
}