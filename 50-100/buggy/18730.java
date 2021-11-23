@java.lang.Override
public void run() {
    if (!(shouldFindUsages(searchParameters, searchParameters.getElementToSearch())))
        return ;
    
    com.thoughtworks.gauge.findUsages.StepCollector collector = new com.thoughtworks.gauge.findUsages.StepCollector(searchParameters.getElementToSearch().getProject());
    collector.collect();
    final java.util.List<com.intellij.psi.PsiElement> elements = com.thoughtworks.gauge.findUsages.ReferenceSearch.getPsiElements(collector, searchParameters.getElementToSearch());
    for (com.intellij.psi.PsiElement element : elements)
        processor.process(element.getReference());
    
}