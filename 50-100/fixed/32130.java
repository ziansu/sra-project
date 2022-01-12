public java.util.ArrayList<java.lang.String> searchCommandKey(java.lang.String key) {
    java.util.ArrayList<java.lang.String> result = new java.util.ArrayList<java.lang.String>();
    java.util.ArrayList<java.lang.String> list = extract(planit.Storage.mainFile);
    int count = 0;
    while (count < (this.mainCount)) {
        if (list.get(count).toLowerCase().contains(key.toLowerCase())) {
            result.add(list.get(count));
        }
        count++;
    } 
    return result;
}