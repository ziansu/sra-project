public void test4() throws com.silicolife.textmining.core.interfaces.core.dataaccess.exception.ANoteException, com.silicolife.textmining.processes.ir.patentpipeline.core.searchmodule.WrongIRPatentIDRecoverConfigurationException {
    java.lang.String identifier = "fucoxanthin";
    main.com.silicolife.textmining.patentpipeline.PubChemAPI.PUGHelp.PUGRestInputEnum inputType = main.com.silicolife.textmining.patentpipeline.PubChemAPI.PUGHelp.PUGRestInputEnum.compoundName;
    main.com.silicolife.textmining.patentpipeline.PubChemAPI.PUGHelp.IIRPubChemPatentIDRetrievalConfiguration configuration = new main.com.silicolife.textmining.patentpipeline.PubChemAPI.PUGHelp.IRPubChemPatentIDRetrievalConfigurationImpl(inputType);
    main.com.silicolife.textmining.patentpipeline.PubChemAPI.IRPubChemPatentIDRetrieval pugRestSearch = new main.com.silicolife.textmining.patentpipeline.PubChemAPI.IRPubChemPatentIDRetrieval(configuration);
    com.silicolife.textmining.processes.ir.patentpipeline.configuration.IIRPatentPipelineSearchConfiguration query = new com.silicolife.textmining.processes.ir.patentpipeline.configuration.IRPatentPipelineSearchConfigurationImpl(identifier);
    java.util.Set<java.lang.String> patentIds = pugRestSearch.retrievalPatentIds(query);
    java.lang.System.out.println(patentIds.size());
    for (java.lang.String patentID : patentIds)
        java.lang.System.out.println(patentID);
    
}