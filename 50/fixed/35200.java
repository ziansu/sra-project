@java.lang.Override
public void updateSessionActivityItemForReactions(int emoticRatingNumber, java.lang.String gooruOid, java.lang.String isRatingsReactions) {
    if ((collectionPlayerPresenter) != null) {
        collectionPlayerPresenter.updateRatReacSessionActivityItem(emoticRatingNumber, gooruOid, isRatingsReactions);
    }
}