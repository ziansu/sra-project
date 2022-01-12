public final void add(com.gelakinetic.mtgfam.helpers.MtgCard card) {
    com.gelakinetic.mtgfam.helpers.CardHelpers.IndividualSetInfo isi = new com.gelakinetic.mtgfam.helpers.CardHelpers.IndividualSetInfo();
    isi.mSet = card.setName;
    isi.mSetCode = card.setCode;
    isi.mNumber = card.mNumber;
    isi.mIsFoil = card.foil;
    isi.mPrice = null;
    isi.mMessage = card.message;
    isi.mNumberOf = card.numberOf;
    isi.mRarity = card.mRarity;
    mInfo.add(isi);
}