public java.lang.String printEmotionalState(java.lang.Double gain) {
    java.lang.String output = "";
    for (data.Emotion emotion : this.getEmotionalState(gain)) {
        output += (((emotion.name) + ": ") + (emotion.intensity)) + ", ";
    }
    return output;
}