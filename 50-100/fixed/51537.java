public void run(org.eclipse.jface.action.IAction action) {
    if (selectedActors.isEmpty())
        return ;
    
    updateUsedFolders();
    org.eclipse.ui.IWorkbench wb = org.eclipse.ui.PlatformUI.getWorkbench();
    org.eclipse.ui.progress.IProgressService ps = wb.getProgressService();
    try {
        br.unb.cic.rtgoretoprism.generator.goda.producer.RTGoreProducer producer = new br.unb.cic.rtgoretoprism.generator.goda.producer.RTGoreProducer(selectedActors, selectedGoals, sourceFolder, targetFolder, false);
        producer.run();
    } catch (br.unb.cic.rtgoretoprism.generator.CodeGenerationException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}