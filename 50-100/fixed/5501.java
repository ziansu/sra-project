public void remove(java.lang.String[] pVSerialName) {
    for (int i = 0; i < (pVSerialName.length); i++) {
        if (this.products.containsKey(pVSerialName[i]))
            this.products.remove(pVSerialName[i]);
        
    }
}