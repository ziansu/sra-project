public java.lang.Integer getEmotionValence(java.lang.String emotionType, java.lang.String agentName) {
    java.lang.Integer valence = getEmotionPotence(emotionType, agentName);
    java.lang.Integer minimum = ft.getThreshold(emotionType);
    if ((valence == null) || (minimum == null))
        return null;
    
    if ((valence > 0) && (valence >= minimum)) {
        return valence - minimum;
    }
    if ((valence < 0) && (valence <= (-minimum))) {
        return valence + minimum;
    }
    return null;
}