private void removeFromLists(int analysisId, sernet.verinice.model.bsi.risikoanalyse.GefaehrdungsUmsetzung gef) throws sernet.verinice.interfaces.CommandException {
    sernet.verinice.service.commands.FindRiskAnalysisListsByParentID command = new sernet.verinice.service.commands.FindRiskAnalysisListsByParentID(analysisId);
    sernet.verinice.service.commands.RemoveElement.getCommandService().executeCommand(command);
    sernet.verinice.model.bsi.risikoanalyse.FinishedRiskAnalysisLists lists = command.getFoundLists();
    lists.removeGefaehrdungCompletely(gef);
}