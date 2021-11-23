public agent.AgentInternalState getEmotionalState(java.lang.Double gain) {
    if (gain != null) {
        agent.AgentInternalState gainState = new agent.AgentInternalState();
        for (data.Emotion emotion : this) {
            if (emotion != null) {
                double gainEmo = (gain * (emotion.intensity)) / ((gain * (emotion.intensity)) + 1);
                gainState.add(new data.Emotion(emotion.name, gainEmo));
            }
        }
        return gainState;
    }
    return this;
}