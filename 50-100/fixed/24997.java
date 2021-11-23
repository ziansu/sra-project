@java.lang.Override
public void passCheckedDay(java.util.Date date, int position, boolean isChecked) {
    fr.wildcodeschool.haa.waxym.model.DayStuffModel passedDay = new fr.wildcodeschool.haa.waxym.model.DayStuffModel();
    if (isChecked) {
        passedDay.setDate(date);
        passedDay.setMorning(1);
        passedDay.setAfternoon(1);
        this.selectedList.add(passedDay);
    }else
        this.selectedList.remove(date);
    
}