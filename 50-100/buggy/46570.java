@org.springframework.scheduling.annotation.Async
@org.springframework.context.event.EventListener
public void handleDocumentReadEvent(de.hska.ld.content.events.document.DocumentReadEvent event) throws de.hska.ld.oidc.client.exception.CreationFailedException, java.io.IOException {
    de.hska.ld.content.persistence.domain.Document document = ((de.hska.ld.content.persistence.domain.Document) (event.getSource()));
    java.lang.System.out.println(((("LDToSSSEventListener: Reading document=" + (document.getId())) + ", title=") + (document.getTitle())));
    document = createAndShareLDocWithSSSUsers(document, "READ", event.getAccessToken());
    event.setResultDocument(document);
}