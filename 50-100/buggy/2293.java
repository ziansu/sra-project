public se.fredsfursten.donationboardplugin.BoardModel getModel(int numberOfDays, int numberOfLevels) {
    se.fredsfursten.donationboardplugin.BoardModel model = new se.fredsfursten.donationboardplugin.BoardModel(numberOfDays, numberOfLevels);
    for (se.fredsfursten.donationboardplugin.DonationStorageModel storageDonation : getDonations()) {
        int day = storageDonation.getDay();
        int level = storageDonation.getLevel();
        if ((storageDonation.getPlayer()) != null) {
            model.markOnlyThis(day, level, storageDonation.getIsEmpty(), storageDonation.getPlayer());
        }
    }
    return model;
}