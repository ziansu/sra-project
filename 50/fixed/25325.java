private de.fred4jupiter.fredbet.domain.Country getCountryOne() {
    if ((getMatch()) == null) {
        return null;
    }
    return getMatch().getCountryOne();
}