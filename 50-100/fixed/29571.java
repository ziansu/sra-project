private void processValidTypes(java.lang.String realName, java.util.List<com.bkromhout.ruqus.ClassName> validTypes) {
    for (com.bkromhout.ruqus.ClassName type : validTypes) {
        if (!(com.bkromhout.ruqus.TransformerDataBuilder.typesMap.containsKey(type)))
            com.bkromhout.ruqus.TransformerDataBuilder.typesMap.put(type, new java.util.HashSet<java.lang.String>());
        
        com.bkromhout.ruqus.TransformerDataBuilder.typesMap.get(type).add(realName);
    }
}