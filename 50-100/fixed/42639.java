public java.lang.String translate(java.lang.String word) {
    if (this.dict.containsKey(word)) {
        return this.dict.get(word);
    }else
        if (this.dict.containsValue(word)) {
            for (java.lang.String key : this.dict.keySet()) {
                if (this.dict.get(key).equals(word)) {
                    return key;
                }
            }
        }
    
    return null;
}