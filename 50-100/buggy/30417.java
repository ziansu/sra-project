@java.lang.Override
public boolean apply(org.apache.ignite.events.Event e) {
    if ((!(lastFound.get())) && (lastOrder == (e.localOrder())))
        lastFound.set(true);
    
    return (((e.localOrder()) > lastOrder) && ((e.timestamp()) > notOlderThan)) && (org.apache.ignite.internal.util.typedef.F.contains(evtTypes, e.type()));
}