public models.RecipientModel mapToModel(api.v1.Recipient aRecipient) {
    models.RecipientModel model;
    if (((aRecipient.id) != null) && ((aRecipient.id) > 0L)) {
        model = RecipientModel.find.byId(aRecipient.id);
        if (model == null) {
            throw new exceptions.PoseidonException(Http.Status.BAD_REQUEST, ("Ugyldig mottaker-id angitt: " + (aRecipient.id)));
        }
    }else {
        model = new models.RecipientModel();
        model.id = aRecipient.id;
    }
    model.email = aRecipient.email;
    return model;
}