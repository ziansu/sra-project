public java.lang.String getDigestsAsString(char delimiter) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (int i = 0; i < (this.digests.size()); i++) {
        sb.append(this.digests.get(i));
        if (i < ((this.digests.size()) - 1))
            sb.append(delimiter);
        
    }
    return sb.toString();
}