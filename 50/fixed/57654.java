@java.lang.Override
public java.util.List<org.ednovo.gooru.core.api.model.Learnguide> listPublishedCollections(final java.lang.String userGooruId) {
    return this.getLearnguideRepository().listPublishedCollections(userGooruId);
}