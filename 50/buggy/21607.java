public java.lang.String getTeamNameOne() {
    de.fred4jupiter.fredbet.domain.Country countryOne = getCountryOne();
    return hasContrySet(countryOne) ? messageUtil.getCountryName(countryOne) : this.bet.getMatch().getTeamNameOne();
}