@java.lang.Override
public int compare(com.android.angrybird.database.Item o1, com.android.angrybird.database.Item o2) {
    try {
        return dateFormat.parse(o2.getDate()).compareTo(dateFormat.parse(o1.getDate()));
    } catch (java.text.ParseException e) {
        return 0;
    }
}