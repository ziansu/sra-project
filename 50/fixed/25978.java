@java.lang.Override
public org.ramonaza.unofficialazaapp.helpers.backend.InfoWrapper[] generateInfo() {
    org.ramonaza.unofficialazaapp.helpers.backend.ChapterPackHandlerSupport.getChapterPackHandler(getActivity(), org.ramonaza.unofficialazaapp.helpers.backend.ChapterPackHandlerSupport.getOptions()[0]);
    handler = org.ramonaza.unofficialazaapp.helpers.backend.ChapterPackHandlerSupport.getEventHandler(getActivity());
    return handler.getEventsFromRss();
}