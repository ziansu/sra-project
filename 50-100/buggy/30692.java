public void returnDonation(final java.lang.String donationId) {
    mDonations.remove(donationId);
    final com.gilshelef.feedme.donors.data.Donor donor = com.gilshelef.feedme.donors.data.Donor.get();
    mDatabase.child(Constants.DB_DONATION).child(donationId).removeValue();
    mDatabase.child(Constants.DB_DONOR_DONATION).child(donor.getId()).child(Constants.DB_DONATION).child(donationId).removeValue();
    java.util.Set<java.lang.String> set = new java.util.HashSet<>();
    set.add(donationId);
    removeImages(set);
}