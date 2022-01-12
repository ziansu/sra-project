@java.lang.Override
public void identify(sk.stuba.fiit.ms.session.Search search) {
    sk.stuba.fiit.ms.session.Session lastSession = (sessions.isEmpty()) ? addNewSession(search) : sessions.get(((sessions.size()) - 1));
    sk.stuba.fiit.ms.session.Search lastSearch = lastSession.getLastSearch();
    if (consecutiveApproach.isSameSession(lastSearch, search)) {
        lastSession.add(search);
    }else {
        addNewSession(search);
    }
}