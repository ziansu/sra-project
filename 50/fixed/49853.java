@java.lang.Override
public void initialize() throws org.xwiki.component.phase.InitializationException {
    org.phenotips.data.internal.controller.SolvedController.fields.put(org.phenotips.data.internal.controller.SolvedController.STATUS_KEY, "status");
    org.phenotips.data.internal.controller.SolvedController.fields.put("solved__pubmed_id", "pubmed_id");
    org.phenotips.data.internal.controller.SolvedController.fields.put("solved__gene_id", "gene");
    org.phenotips.data.internal.controller.SolvedController.fields.put("solved__notes", "notes");
}