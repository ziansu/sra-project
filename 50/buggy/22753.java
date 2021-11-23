@java.lang.Override
public void afterTextChanged(android.text.Editable p1) {
    byte[] decoded = org.apache.commons.codec.binary.Base64.decodeBase64(p1.toString().getBytes());
    output.setText(new java.lang.String(decoded));
}