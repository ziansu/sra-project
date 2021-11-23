public com.youcruit.billogram.objects.response.billogram.BillogramResponse commandCredit(java.lang.String billogramId, java.math.BigDecimal amount, com.youcruit.billogram.client.BillogramClient.CreditMode creditMode) throws java.io.IOException {
    java.util.Map<java.lang.String, java.lang.Object> creditRequest = new java.util.HashMap<>();
    creditRequest.put("mode", creditMode);
    creditRequest.put("amount", amount);
    final java.net.URI uri = httpClient.pathToUri(("billogram" + billogramId), "command", "credit");
    return httpClient.sync(uri, creditRequest, com.youcruit.billogram.client.http.HttpClient.Method.POST, com.youcruit.billogram.objects.response.billogram.BillogramResponse.class);
}