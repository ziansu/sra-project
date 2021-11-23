private <T extends org.dd4t.core.databind.BaseViewModel> void setTridionProperties(final org.dd4t.core.databind.TridionViewModel model, final com.fasterxml.jackson.databind.JsonNode rawComponent) {
    model.setLastPublishDate(org.dd4t.databind.util.JsonUtils.getDateFromField(DataBindConstants.LAST_PUBLISHED_DATE, rawComponent));
    model.setLastModified(org.dd4t.databind.util.JsonUtils.getDateFromField(DataBindConstants.LAST_MODIFIED_DATE, rawComponent));
    model.setTcmUri(org.dd4t.databind.util.JsonUtils.getTcmUriFromField(DataBindConstants.ID, rawComponent));
}