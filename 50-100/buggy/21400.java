@org.springframework.web.bind.annotation.RequestMapping(path = "/{user}", method = org.springframework.web.bind.annotation.RequestMethod.PUT)
public void register(@org.springframework.web.bind.annotation.PathVariable(value = "user")
java.lang.String userName, @org.springframework.web.bind.annotation.RequestBody
org.bluedevel.hollidaymanager.models.Holiday newHoliday) throws org.bluedevel.hollidaymanager.resources.exceptions.NoMoreHolidayLeftException, org.bluedevel.hollidaymanager.resources.exceptions.UserNotFoundException {
    org.bluedevel.hollidaymanager.models.User user = userDao.findByUsername(userName).orElseThrow(UserNotFoundException::new);
    if ((workdayService.getUsedDays(user, newHoliday)) >= (user.getVacationDays())) {
        throw new org.bluedevel.hollidaymanager.resources.exceptions.NoMoreHolidayLeftException();
    }
    newHoliday.setUser(user);
    holidayDao.save(newHoliday);
}