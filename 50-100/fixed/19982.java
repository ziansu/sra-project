public java.lang.String getWeights() {
    java.lang.StringBuffer result = new java.lang.StringBuffer("");
    for (int i = 0; i < (m_Weight.length); i++) {
        if (i > 0)
            result.append(" ");
        
        result.append(m_Weight[i]);
    }
    return result.toString();
}