private void processValidTypes(java.lang.String realName, java.lang.Class[] validTypes) {
    for (java.lang.Class type : validTypes) {
        com.bkromhout.ruqus.ClassName typeName = com.bkromhout.ruqus.ClassName.get(type);
        if (!(com.bkromhout.ruqus.TransformerDataBuilder.typesMap.containsKey(typeName)))
            com.bkromhout.ruqus.TransformerDataBuilder.typesMap.put(typeName, new java.util.HashSet<java.lang.String>());
        
        com.bkromhout.ruqus.TransformerDataBuilder.typesMap.get(typeName).add(realName);
    }
}