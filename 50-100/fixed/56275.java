@com.fasterxml.jackson.annotation.JsonGetter(value = com.nestlabs.sdk.Structure.KEY_POSTAL_CODE)
public java.lang.String getPostalCode() {
    if ("CA".equals(mCountryCode)) {
        return ((mPostalCode.substring(0, 3)) + " ") + (mPostalCode.substring(3, 6));
    }else {
        return mPostalCode;
    }
}