@java.lang.Override
public void nodeRemoved(@org.jetbrains.annotations.NotNull
org.jetbrains.mps.openapi.event.SNodeRemoveEvent event) {
    if (!(event.isRoot())) {
        return ;
    }
    jetbrains.mps.smodel.Language language = jetbrains.mps.smodel.Language.getLanguageFor(event.getModel());
    if (language != null) {
        refreshModule(language);
    }
}