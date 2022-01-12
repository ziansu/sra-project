public java.lang.String getTeamNameOne() {
    return !(Country.NONE.equals(this.countryTeamOne)) ? messageUtil.getCountryName(countryTeamOne) : nameTeamOne;
}