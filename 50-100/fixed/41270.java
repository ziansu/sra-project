private java.util.List<com.stratelia.silverpeas.contentManager.GlobalSilverContent> transformSilverContentsToGlobalSilverContents(java.util.List<com.stratelia.silverpeas.contentManager.SilverContentInterface> silverContentTempo) {
    java.util.ArrayList<com.stratelia.silverpeas.contentManager.GlobalSilverContent> silverContents = new java.util.ArrayList<>();
    com.stratelia.silverpeas.contentManager.GlobalSilverContent gsc;
    for (com.stratelia.silverpeas.contentManager.SilverContentInterface sci : silverContentTempo) {
        gsc = new com.stratelia.silverpeas.contentManager.GlobalSilverContent(sci, "useless", null, null);
        silverContents.add(gsc);
    }
    return silverContents;
}