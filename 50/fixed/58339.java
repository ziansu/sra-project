@android.arch.persistence.room.TypeConverter
public static java.lang.Long dateToTimestamp(java.util.Date date) {
    return date == null ? null : java.util.Calendar.getInstance().getTime().getTime();
}