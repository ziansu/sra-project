protected java.util.Date getParsedDate(java.lang.String date) {
    if (date == null) {
        return null;
    }
    try {
        return uk.chromis.pos.json.adapters.BaseAdapter.COMMON_DATE_FORMAT.parse(date);
    } catch (java.text.ParseException e) {
        return null;
    }
}