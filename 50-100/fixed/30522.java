@java.lang.Override
public void open(eu.stratosphere.configuration.Configuration parameters) throws java.lang.Exception {
    java.util.Collection<de.tuberlin.dima.schubotz.fse.Query> queries = getRuntimeContext().getBroadcastVariable("Queries");
    for (de.tuberlin.dima.schubotz.fse.Query query : queries) {
        for (java.util.Map.Entry<java.lang.String, java.lang.String> formula : query.formulae.entrySet()) {
            org.w3c.dom.Node node = de.tuberlin.dima.schubotz.fse.XMLHelper.String2Doc(formula.getValue(), false);
        }
    }
    super.open(parameters);
}