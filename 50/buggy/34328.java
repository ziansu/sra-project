public int count(java.lang.String label) {
    java.lang.Integer result = countsByLabel.get(label);
    if (result == null)
        return 0;
    
    return result;
}