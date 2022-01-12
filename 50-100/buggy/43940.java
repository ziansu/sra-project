protected de.uni_potsdam.hpi.bpt.bp2014.jcore.ControlNodeInstance createControlNode(java.lang.String type, int id) {
    de.uni_potsdam.hpi.bpt.bp2014.jcore.ControlNodeInstance controlNodeInstance = null;
    switch (type) {
        case "Activity" :
        case "EmailTask" :
        case "WebServiceTask" :
            controlNodeInstance = new de.uni_potsdam.hpi.bpt.bp2014.jcore.ActivityInstance(id, fragmentInstance_id, scenarioInstance, false);
            break;
        case "Endevent" :
            controlNodeInstance = new de.uni_potsdam.hpi.bpt.bp2014.jcore.EventInstance(fragmentInstance_id, scenarioInstance, "Endevent");
            break;
        case "XOR" :
        case "AND" :
            controlNodeInstance = new de.uni_potsdam.hpi.bpt.bp2014.jcore.GatewayInstance(id, fragmentInstance_id, scenarioInstance);
            break;
    }
    return controlNodeInstance;
}