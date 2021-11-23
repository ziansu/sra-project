@java.lang.Override
public java.lang.String toString() {
    com.fasterxml.jackson.databind.ObjectMapper om = new com.fasterxml.jackson.databind.ObjectMapper();
    try {
        return om.writeValueAsString(this);
    } catch (java.lang.Exception e) {
        return null;
    } finally {
        om = null;
    }
}