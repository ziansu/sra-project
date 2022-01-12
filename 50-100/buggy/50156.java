@java.lang.Override
public int compareTo(capstat.model.ChalmersAge other) {
    capstat.model.Birthday otherBirthday = other.getBirthday();
    int birthdayCompare = this.birthday.compareTo(otherBirthday);
    if (birthdayCompare != 0)
        return birthdayCompare;
    
    capstat.model.Admittance otherAdmittance = other.getAdmittance();
    int admittanceCompare = this.admittance.compareTo(otherAdmittance);
    if (admittanceCompare != 0)
        return admittanceCompare;
    
    return 0;
}