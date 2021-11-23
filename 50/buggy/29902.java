private void nudgeYear(com.demo.model.InternalTime t) {
    if (isYearOutOfRange(t.toTime())) {
        throw new com.demo.exception.InvalidCrontabError("Trigger is invalid.", com.demo.i18n.I18NKeys.INVALID_TRIGGER);
    }
    t.setYear(((t.getYear()) + 1));
}