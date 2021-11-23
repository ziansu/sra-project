private de.d3web.core.session.Session createSessionInternally(de.knowwe.core.user.UserContext context, de.d3web.core.knowledge.KnowledgeBase kb) {
    removeSessionInternally(context, kb, true);
    de.d3web.core.session.Session session = de.d3web.core.session.SessionFactory.createSession(kb);
    de.knowwe.core.event.EventManager.getInstance().fireEvent(new de.d3web.we.basic.SessionCreatedEvent(session, context));
    sessions.put(kb.getId(), session);
    return session;
}