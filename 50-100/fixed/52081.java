@java.lang.Override
public boolean equals(java.lang.Object o) {
    if (o == (this)) {
        return true;
    }
    if (!(o instanceof com.aipo.social.opensocial.spi.AipoCollectionOptions)) {
        return false;
    }
    com.aipo.social.opensocial.spi.AipoCollectionOptions actual = ((com.aipo.social.opensocial.spi.AipoCollectionOptions) (o));
    return (super.equals(o)) && (this.map.equals(actual.map));
}