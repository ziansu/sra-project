@java.lang.Override
public msi.gama.util.GamaMap<java.lang.String, java.lang.Object> fetchMessageBox(msi.gama.metamodel.agent.IAgent agt) {
    msi.gama.util.GamaMap<java.lang.String, java.lang.Object> m = msi.gama.util.GamaMapFactory.create();
    final java.lang.String cli;
    java.lang.String receiveMessage = "";
    m = ((msi.gama.util.GamaMap<java.lang.String, java.lang.Object>) (agt.getAttribute(("messages" + agt))));
    agt.setAttribute("messages", GamaMapFactory.EMPTY_MAP);
    return m;
}