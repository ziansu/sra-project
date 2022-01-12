@org.springframework.web.bind.annotation.RequestMapping(value = "/")
public org.springframework.http.ResponseEntity<java.lang.String> messengerApi(@org.springframework.web.bind.annotation.RequestParam(value = "hub.challenge")
java.lang.String hub_challenge, @org.springframework.web.bind.annotation.RequestParam(value = "hub.verify_token")
java.lang.String hub_verify_token) {
    if (hub_verify_token.equals("EAAXZCwSPPJToBAG0ZCsjU9V0fGEtxlm8Onz9wLLRWxXI40v8BVWjeWGyhOqZCe7cZBwv8BJBZCHrTZBcHEOZARHap26M7AQ1iEZC3oorK75S4yUBjTVCT5h20JgMRyAkcytaZCCndNyjvdCoIiiNSARJlkHNFKFBtgl6V0toVu778gAZDZD")) {
        return new org.springframework.http.ResponseEntity<java.lang.String>(hub_challenge, org.springframework.http.HttpStatus.OK);
    }
    return new org.springframework.http.ResponseEntity<java.lang.String>(hub_verify_token, org.springframework.http.HttpStatus.OK);
}