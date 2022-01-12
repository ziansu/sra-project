protected synchronized void loadContentModels() throws dk.statsbiblioteket.doms.client.exceptions.ServerOperationFailed {
    if (cmloaded) {
        return ;
    }
    cmloaded = true;
    for (java.lang.String contentModel : profile.getContentmodels()) {
        dk.statsbiblioteket.doms.client.objects.DigitalObject cm_object = factory.getDigitalObject(contentModel);
        if (cm_object instanceof dk.statsbiblioteket.doms.client.objects.ContentModelObject) {
            dk.statsbiblioteket.doms.client.objects.ContentModelObject object = ((dk.statsbiblioteket.doms.client.objects.ContentModelObject) (cm_object));
            type.add(object);
        }else {
            throw new dk.statsbiblioteket.doms.client.exceptions.ServerOperationFailed((((("Object '" + (pid)) + "' has the content model '") + contentModel) + "' declared, but this is not a content model"));
        }
    }
}