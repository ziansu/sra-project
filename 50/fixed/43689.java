@java.lang.Override
public org.akanza.androidosms.core.OSms build() throws java.io.IOException, org.akanza.androidosms.core.exception.HttpApiOrangeException {
    if (((id) != null) && ((secretCode) != null)) {
        org.akanza.androidosms.entity.Token token = obtainsToken();
        return new org.akanza.androidosms.core.OSms(token, Builder.client);
    }
    return null;
}