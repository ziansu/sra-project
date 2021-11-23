@java.lang.Override
public java.lang.String serialize(final nl.tudelft.ti2806.riverrush.network.protocol.Protocol protocol) {
    java.lang.String msg = super.serialize(protocol);
    return (((((((msg + (protocol.getPairSeperator())) + "variation") + (protocol.getKeyValueSeperator())) + (protocol.getPairSeperator())) + "sector") + (protocol.getKeyValueSeperator())) + (this.sector)) + (this.variation.toString());
}