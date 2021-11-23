@org.junit.Test
public void testValidate_Expired_ValidSig() throws java.lang.Exception {
    java.lang.String token = generateToken(true);
    com.nimbusds.jwt.SignedJWT jwt = io.craigmiller160.orgbuilder.server.rest.JWTUtil.parseAndValidateTokenSignature(token);
    org.junit.Assert.assertNotNull("Token wasn't validated and returned", jwt);
    boolean result = io.craigmiller160.orgbuilder.server.rest.JWTUtil.isTokenExpired(jwt);
    org.junit.Assert.assertTrue("Token should be expired", result);
}