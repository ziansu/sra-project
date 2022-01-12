public void registerMeAt(java.lang.String url) {
    java.lang.System.out.println(("Will now register myself at: " + url));
    java.lang.String[] otherServices = template.postForObject(((url + "/register?port=") + (port)), null, java.lang.String[].class);
    this.otherServices.add(url);
    for (java.lang.String service : otherServices) {
        if (this.otherServices.contains(service)) {
            continue;
        }
        this.otherServices.add(service);
        registerMeAt(service);
    }
}