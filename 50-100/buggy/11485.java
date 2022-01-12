public org.lirazs.gbackbone.client.core.data.Options defaults(org.lirazs.gbackbone.client.core.data.Options... args) {
    for (org.lirazs.gbackbone.client.core.data.Options source : args) {
        for (java.lang.String key : source.keySet()) {
            if (!(containsKey(key))) {
                put(key, source.get(key));
            }
        }
    }
    return this;
}