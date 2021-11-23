public static nl.ou.dpd.domain.DesignPattern createObserverPattern() {
    final nl.ou.dpd.domain.DesignPattern observer = new nl.ou.dpd.domain.DesignPattern("Observer");
    observer.add(nl.ou.dpd.utils.TestHelper.createEdge("ConcreteSubject", "Subject", EdgeType.INHERITANCE));
    observer.add(nl.ou.dpd.utils.TestHelper.createEdge("Subject", "Observer", EdgeType.ASSOCIATION_DIRECTED));
    observer.add(nl.ou.dpd.utils.TestHelper.createEdge("ConcreteObserver", "Observer", EdgeType.INHERITANCE));
    observer.add(nl.ou.dpd.utils.TestHelper.createEdge("ConcreteObserver", "ConcreteSubject", EdgeType.ASSOCIATION_DIRECTED));
    return observer;
}