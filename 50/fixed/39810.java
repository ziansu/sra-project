public java.lang.String GetString(java.lang.String utteranceString) {
    for (edu.wwu.center.studenttechnology.util.speech.assets.SampleUtterance sampleUtterance : utteranceList) {
        java.lang.String result = sampleUtterance.CheckString(utteranceString.toLowerCase());
        if (result == null) {
            continue;
        }
        return result;
    }
    return null;
}