protected void setPublication(org.silverpeas.core.contribution.publication.model.PublicationDetail publication) {
    this.publication = publication;
    this.content = getPublication().getWysiwyg();
}