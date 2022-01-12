public void addSponsor(java.lang.String organization, int level, int order, java.lang.String summary, java.lang.String sponsorImage, java.lang.String website, java.lang.Boolean booth) {
    sponsors.add(new org.texaslinuxfest.txlf.Guide.Sponsor(organization, level, order, summary, sponsorImage, website, booth));
}