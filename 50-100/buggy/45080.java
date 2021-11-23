@java.lang.Override
public void readFrom(final org.jboss.netty.buffer.ChannelBuffer data, final int length) {
    super.readFrom(data, length);
    this.markerType = org.openflow.vendor.enslab.OFMarkerType.valueOf(data.readInt());
    this.markerId = data.readInt();
    this.markerData = this.markerType.newInstance(OFEnslabVendorData.ENSLAB_MARKER_CONFIG);
    this.markerData.readFrom(data);
}