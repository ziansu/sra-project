private com.sgcib.github.api.payloayd.PullRequest getPullRequest(java.lang.String url, int number) {
    java.util.Map<java.lang.String, java.lang.String> param = new java.util.HashMap<>(1);
    param.put("number", java.lang.Integer.toString(number));
    org.springframework.web.client.RestTemplate restTemplate = new org.springframework.web.client.RestTemplate();
    return restTemplate.getForObject(url, com.sgcib.github.api.payloayd.PullRequest.class);
}