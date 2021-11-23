@volo.voloCalendar.entity.Transient
public volo.voloCalendar.entity.TelephoneType getTelephoneType() {
    if ((telephoneTypeShort) == 0) {
        return null;
    }
    return volo.voloCalendar.entity.TelephoneType.values()[telephoneTypeShort];
}