@javax.ws.rs.Path(value = "/{idAnnotatedCollaborativeContentAnalysis:.*}")
@javax.ws.rs.GET
public java.util.Collection<eu.learnpad.ca.rest.data.collaborative.AnnotatedCollaborativeContentAnalysis> getCollaborativeContentVerifications(@javax.ws.rs.PathParam(value = "idAnnotatedCollaborativeContentAnalysis")
java.lang.String contentID) throws eu.learnpad.exception.LpRestException {
    if (eu.learnpad.ca.rest.impl.ColloborativeContentVerificationsImpl.map.containsKey(java.lang.Integer.valueOf(contentID))) {
        eu.learnpad.ca.rest.data.collaborative.CollaborativeContentAnalysis caa = eu.learnpad.ca.rest.impl.ColloborativeContentVerificationsImpl.map.get(contentID);
        eu.learnpad.ca.correctness.CorrectnessAnalysis corrana = new eu.learnpad.ca.correctness.CorrectnessAnalysis(new org.languagetool.language.BritishEnglish());
        eu.learnpad.ca.rest.data.collaborative.AnnotatedCollaborativeContentAnalysis acca = corrana.check(caa);
        java.util.ArrayList<eu.learnpad.ca.rest.data.collaborative.AnnotatedCollaborativeContentAnalysis> ar = new java.util.ArrayList<eu.learnpad.ca.rest.data.collaborative.AnnotatedCollaborativeContentAnalysis>();
        ar.add(acca);
        return ar;
    }else
        return null;
    
}