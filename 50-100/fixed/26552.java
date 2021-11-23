public void setValue(java.lang.String val) {
    if (((inputType) == (com.hadassah.azrieli.lev_isha.utility.PersonalProfileEntry.FINITE_STATES)) && (((!(val.equals(com.hadassah.azrieli.lev_isha.utility.PersonalProfileEntry.YES_VALUE))) && (!(val.equals(com.hadassah.azrieli.lev_isha.utility.PersonalProfileEntry.NO_VALUE)))) && (!(val.equals(com.hadassah.azrieli.lev_isha.utility.PersonalProfileEntry.MAYBE_VALUE)))))
        return ;
    
    this.val = val;
    this.modified = java.util.Calendar.getInstance();
}