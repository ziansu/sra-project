@java.lang.Override
public es.upm.fi.dia.oeg.map4rdf.client.action.GetAllConfigurationsDescriptionResult execute(es.upm.fi.dia.oeg.map4rdf.client.action.GetAllConfigurationsDescription action, net.customware.gwt.dispatch.server.ExecutionContext context) throws net.customware.gwt.dispatch.shared.DispatchException {
    java.util.List<es.upm.fi.dia.oeg.map4rdf.share.conf.util.ConfigurationDescription> toReturn = new java.util.ArrayList<es.upm.fi.dia.oeg.map4rdf.share.conf.util.ConfigurationDescription>();
    for (java.lang.String id : configurations.getConfigurationIDs()) {
        es.upm.fi.dia.oeg.map4rdf.share.conf.util.ConfigurationDescription toAdd = new es.upm.fi.dia.oeg.map4rdf.share.conf.util.ConfigurationDescription(id);
        addDescriptions(toAdd);
        addLabels(toAdd);
        addImage(toAdd);
    }
    return new es.upm.fi.dia.oeg.map4rdf.client.action.GetAllConfigurationsDescriptionResult(toReturn);
}