@java.lang.Override
public org.restlet.Restlet createInboundRoot() {
    org.restlet.routing.Router router = new org.restlet.routing.Router(getContext());
    router.attach("/groups", com.aat.web.GroupResource.class);
    router.attach("/students", com.aat.web.StudentResource.class);
    router.attach("/participation/{studentNumber}", com.aat.web.ParticipationResource.class);
    router.attach("/group/{groupNumber}", com.aat.web.GroupResource.class);
    router.attach("/signup/{studentNumber}/{groupNumber}", com.aat.web.StudentResource.class);
    router.attach("/qrcode/new/{studentNumber}", com.aat.web.QRCodeCreationResource.class);
    router.attach("/qrcode/valid/{studentNumber}/{time}/{randNumber}", com.aat.web.QRCodeValidationResource.class);
    return router;
}