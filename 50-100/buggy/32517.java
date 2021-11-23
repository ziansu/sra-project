@org.junit.Test
public void testSourceSelectionPartnersNull() throws java.lang.Exception {
    eu.eexcess.federatedrecommender.sourceselection.AgeSourceSelector ageSourceSelector = new eu.eexcess.federatedrecommender.sourceselection.AgeSourceSelector();
    java.util.List<eu.eexcess.dataformats.PartnerBadge> partners = null;
    eu.eexcess.dataformats.userprofile.SecureUserProfile userProfile = new eu.eexcess.dataformats.userprofile.SecureUserProfile();
    userProfile.setAgeRange(2);
    ageSourceSelector.sourceSelect(userProfile, partners);
    if (userProfile.getPartnerList().isEmpty()) {
        assert true;
    }else
        throw new java.lang.AssertionError();
    
}