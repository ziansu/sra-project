@com.fasterxml.jackson.annotation.JsonIgnore
public void setUpdated(final java.util.Date updated) {
    com.netflix.genie.common.model.Auditable.LOG.info((((("Tried to set updated time to " + updated) + " for entity ") + (this.id)) + ". Ignoring."));
}