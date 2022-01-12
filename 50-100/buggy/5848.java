public boolean isChanged() {
    return ((((!(citate.isEmpty())) || ((translationRating) > 0)) || ((rating) > 0)) || (((carteCitita) != null) && ((carteCitita.getDataStart()) != null))) || (org.apache.commons.lang3.StringUtils.isNotEmpty(review));
}