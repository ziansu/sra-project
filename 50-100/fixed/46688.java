public void create() {
    java.lang.String s = "hello";
    org.springframework.web.client.RestTemplate r = new org.springframework.web.client.RestTemplate();
    url += (("/" + (objectId)) + "/") + (objectInstanceId);
    java.lang.System.out.println(("Sending the request: " + (url)));
    java.lang.String response = r.postForObject(url, s, java.lang.String.class);
    java.lang.System.out.println(("Receiving the response: " + response));
}