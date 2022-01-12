public static java.lang.String toSUMO(edu.stanford.nlp.util.IntPair ip, java.util.List<edu.stanford.nlp.ling.CoreLabel> tokens) {
    java.lang.String NERclass = tokens.get(((ip.getSource()) - 1)).ner();
    if (NERclass.equals("PERSON"))
        return "Human";
    else
        if (NERclass.equals("LOCATION"))
            return "GeographicArea";
        else
            if (NERclass.equals("ORGANIZATION"))
                return "Organization";
            
        
    
    return "";
}