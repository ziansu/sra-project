public java.lang.String getWeights() {
    java.lang.String result;
    int i;
    result = "";
    for (i = 0; i < (m_Weight.length); i++) {
        if (i > 0)
            result += " ";
        
        result += java.lang.Double.toString(m_Weight[i]);
    }
    return result;
}