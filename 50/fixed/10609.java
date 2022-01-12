public java.lang.String getTeamNameOne() {
    if ((this.countryTeamOne) == null) {
        return nameTeamOne;
    }
    return !(Country.NONE.equals(this.countryTeamOne)) ? messageUtil.getCountryName(countryTeamOne) : nameTeamOne;
}