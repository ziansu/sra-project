@org.junit.jupiter.api.Test
@org.junit.jupiter.api.DisplayName(value = "Standard headers")
void standardHeaders() {
    java.lang.String headers = new jbs.response.HeadersBuilder(this.requestData, 200).toString();
    org.junit.jupiter.api.Assertions.assertEquals((((((((("HTTP/1.1 200 \n" + "Date: ") + (this.date)) + "\n") + "X-XSS-Protection: 1; mode=block\n") + "X-Frame-Options: DENY\n") + "Content-Type: text/plain\n") + "\n") + ""), headers);
}