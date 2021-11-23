protected java.lang.String getFormattedDate(java.util.Date date) {
    if (date == null) {
        return null;
    }
    return uk.chromis.pos.json.adapters.BaseAdapter.COMMON_DATE_FORMAT.format(date);
}