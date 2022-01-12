public java.lang.String printEmotionalState(java.lang.Double gain) {
    java.lang.String output = "";
    agent.AgentInternalState emotionalState = this.getEmotionalState(gain);
    for (data.Emotion emotion : emotionalState) {
        output += (((emotion.name) + ": ") + (emotion.intensity)) + ", ";
    }
    return output;
}