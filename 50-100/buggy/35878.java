public void init(org.apache.hadoop.io.Text key, byte typeId) {
    this.typeId = typeId;
    this.rawKey = key;
    if (isNumberFamily()) {
        java.lang.String valueStr = new java.lang.String(key.getBytes(), 1, ((key.getLength()) - 1));
        if (isIntegerFamily()) {
            this.keyInObj = java.lang.Integer.parseInt(valueStr);
        }else {
            this.keyInObj = java.lang.Double.parseDouble(valueStr);
        }
    }else {
        this.keyInObj = key;
    }
}